package com.example.myedt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView

class DetailSeanceActivity : AppCompatActivity() {

    lateinit var seance: Seance
    var seanceIndex:Int = -1
    lateinit var titreView: TextView
    lateinit var descriptionView: TextView
    lateinit var enseignantView:TextView
    lateinit var dateView: TextView
    lateinit var dureeView:TextView


    companion object {

        val EXTRA_Seance = "seance"
        val EXTRA_Seance_INDEX = "seanceIndex"

    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_seance)

        seance = intent.getParcelableExtra<Seance>(EXTRA_Seance)!!
        seanceIndex = intent.getIntExtra(EXTRA_Seance_INDEX, -1)
        titreView = findViewById(R.id.titreView) as TextView
        descriptionView = findViewById(R.id.descriptionView) as TextView
        enseignantView = findViewById(R.id.enseignantView) as TextView
        dateView = findViewById(R.id.dateView) as TextView
        dureeView = findViewById(R.id.dureeView) as TextView



        titreView.text = seance.titre
        descriptionView.text = seance.description
        enseignantView.text = seance.enseignant
        dateView.text = seance.date
        dureeView.text = seance.duree.toString()

        enseignantView.setOnClickListener(){
            val intent = Intent(this, EnseignantDetailActivity::class.java)

            startActivity(intent)
        }


    }


}