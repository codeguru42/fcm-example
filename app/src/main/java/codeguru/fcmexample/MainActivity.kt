package codeguru.fcmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import codeguru.fcmexample.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pushBtn.setOnClickListener {
            Snackbar.make(
                binding.root,
                getString(R.string.sending_message),
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}
