package com.example.myuca

import android.os.AsyncTask
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class Operations (private val callback:(List<Coordinador>) -> Unit) : AsyncTask <Void, Void, List<Coordinador>>(){
    override fun doInBackground(vararg params: Void?): List<Coordinador> {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("http://192.168.0.6/damo2--Marcelo_Rivera/mostrarcoord.php")
            .build()

        val response = client.newCall(request).execute()
        val responseString = response.body?.string()
        val users = mutableListOf<Coordinador>()

        if(response.isSuccessful && responseString != null){
            val jsonArray = JSONArray(responseString)
            for (i in 0 until jsonArray.length()){
                val jsonObject = jsonArray.getJSONObject(i)

                val id = jsonObject.getInt("id")
                val nombres = jsonObject.getString("nombres")
                val apellidos = jsonObject.getString("apellidos")
                val fechaNac = jsonObject.getString("fechaNac")
                val titulo = jsonObject.getString("titulo")
                val email = jsonObject.getString("email")
                val facultad = jsonObject.getString("facultad")

                val coordinador = Coordinador(id, nombres, apellidos, fechaNac, titulo, email, facultad)
                users.add(coordinador)
            }
        }
        return users
    }
    override fun onPostExecute(result: List<Coordinador>) {
        super.onPostExecute(result)
        callback(result)
    }

}