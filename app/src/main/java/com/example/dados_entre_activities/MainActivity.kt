package com.example.dados_entre_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.btnCalcular)  //variavel que encontra o id botao no layout
        button.setOnClickListener{
            callActivity() // funcao para clicar no botao e mostrar a mesnsagem "nome ou msg"
        }




        val cleanName = findViewById<EditText>(R.id.etName)
        cleanName.setOnClickListener{
            cleanName.setText("")
        }
        val cleanLastName = findViewById<EditText>(R.id.etPeso)
        cleanName.setOnClickListener{
            cleanLastName.setText("")
        }
        val cleanEmail = findViewById<EditText>(R.id.etAltura)
        cleanName.setOnClickListener{
            cleanEmail.setText("")
        }
    }




    



    private fun callActivity() {


        val editTextName = findViewById<EditText>(R.id.etName)  // variavel editText pega a id "edName" no xml do layout
        val messageName = editTextName.text.toString()


        val editTextLastName = findViewById<EditText>(R.id.etPeso)
        val messageLastName = editTextLastName.text.toString()

        val editTextEmail = findViewById<EditText>(R.id.etAltura)
        val messageEmail = editTextEmail.text.toString()


// variavel intent busca a activity que mostrara a msg digitada.. passar dados entre activities

        val intent = Intent(this,Mostrar_Msg::class.java)
        intent.putExtra("Message_Name", messageName)
        intent.putExtra("Message_Peso", messageLastName)
        intent.putExtra("Message_Altura", messageEmail)

        startActivity(intent)

    }
}

