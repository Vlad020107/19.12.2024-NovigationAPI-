package ru.example.a19122024

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.DialogCompat
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val games = arrayOf("Mario", "TMNT", "Trraria", "Sims4", "Minecraft")
        var number = 0
        return AlertDialog.Builder(activity)

            .setSingleChoiceItems(games, 0) { dialog, which ->
                number = which
            }
            .setTitle("Какая игра будет популярна  2025")
            .setPositiveButton("OK") { dialog, which ->
                Toast.makeText(activity?.baseContext!!, games[number], Toast.LENGTH_SHORT).show()
            }
//            .setMessage("Вы хотите рыбов? Вам всего лишь нужно 3 пачка...")
//            .setPositiveButton("Да, нужно!", null)
//            .setNegativeButton("Нет", null)
//            .setNeutralButton("Воздержусь", null)
            .create()
    }

}