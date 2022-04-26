package banana.code.instagramdownloader.ui.splash

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import banana.code.instagramdownloader.core.navigate
import banana.code.instagramdownloader.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        object: CountDownTimer(3000, 3000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
            }
        }.start()
    }
}