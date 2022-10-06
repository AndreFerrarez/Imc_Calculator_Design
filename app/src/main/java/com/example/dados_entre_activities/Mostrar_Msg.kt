package com.example.dados_entre_activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.dados_entre_activities.databinding.ActivityMostrarMsgBinding
import org.w3c.dom.Text

class Mostrar_Msg : AppCompatActivity() {

   @SuppressLint("MissingInflatedId")
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_mostrar_msg)
       supportActionBar?.hide()


       val messageName = intent.getStringExtra("Message_Name")
       val messageLastName = intent.getStringExtra("Message_Peso")
       val messageEmail = intent.getStringExtra("Message_Altura")

       val tvMessageName = findViewById<TextView>(R.id.tvMessageName).apply{
           text = messageName   // val que recebe o texto da activity 1 e mostra na activity2
       }

       val tvMessageLastName = findViewById<TextView>(R.id.tvMessageLastName).apply {
           text = messageLastName // val que recebe o Peso da activity 1
       }

       val tvMessageEmail = findViewById<TextView>(R.id.tvMessageEmail).apply{
           text = messageEmail  // var que recebe a altura da activity 1
       }

   }


}