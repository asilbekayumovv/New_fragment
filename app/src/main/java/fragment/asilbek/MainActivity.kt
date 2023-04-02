package fragment.asilbek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fragment.asilbek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportFragmentManager.beginTransaction()
            .add(R.id.main, HomeFragment())
            .commit()
    }
}