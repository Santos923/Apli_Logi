package com.example.apli_logi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val nombre: EditText = findViewById(R.id.EditT_Nombre );
        val usuario: EditText = findViewById(R.id.EditT_usuario );
        val password: EditText = findViewById(R.id.EditT_password)
        val edad: EditText = findViewById(R.id.EditText_Edad );
        val email: EditText = findViewById(R.id.EditT_email );

        val btn: Button = findViewById(R.id.EditT_registrar );
        btn.setOnClickListener {
            val intent: Intent = Intent (this, Registro:: class.java)
            startActivity(intent)
        }

        }
}