package intro.android.debora_amorim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAction = findViewById<Button>(R.id.button)
        buttonAction.setOnClickListener {
            val intent = Intent(this, OpenCamara::class.java)
            startActivity(intent)
        }
    }

}