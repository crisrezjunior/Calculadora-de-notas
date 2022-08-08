package com.rezende.calculadoradenotas

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rezende.calculadoradenotas.databinding.ActivityMainBinding

lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnCalcular.setOnClickListener {

            val n1 = binding.nota1
            val n2 = binding.nota2
            val n3 = binding.nota3
            val n4 = binding.nota4
            val nfaltas = binding.faltas


            val nota1 = Integer.parseInt(n1.text.toString())
            val nota2 = Integer.parseInt(n2.text.toString())
            val nota3 = Integer.parseInt(n3.text.toString())
            val nota4 = Integer.parseInt(n4.text.toString())
            val faltas = Integer.parseInt(nfaltas.text.toString())
            val resultado = binding.mediaFinal

            val media = (nota1 + nota2 + nota3 + nota4) / 4

            when {
                media >= 5 && faltas <= 20 -> resultado.setText("aluno foi aprovado \n media final $media")

                faltas > 20 -> resultado.setText("o aluno reprovado por faltas \n media final $media")

                media < 5 -> resultado.setText("o aluno foi reprovado por nota \n media final $media")


            }

            /*    if(media >= 5 && faltas <=20 ) {

                resultado.setText("aluno foi aprovado \n media final $media")
                resultado.setTextColor(getColor(R.color.Green))

            } else if(faltas<20){

                resultado.setText("o aluno reprovado por faltas \n media final $media")
                resultado.setTextColor(getColor(R.color.Red))

            }else if(media < 5){

                resultado.setText("o aluno foi reprovado por nota \n media final $media")
            }
*/

            }

    }
}