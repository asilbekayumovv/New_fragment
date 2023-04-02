package fragment.asilbek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fragment.asilbek.databinding.FragmentHomeBinding
import fragment.asilbek.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentProfileBinding.inflate(inflater,container, false )

        binding.home.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, HomeFragment())
                .commit()
        }
        binding.profile.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, ProfileFragment())
                .addToBackStack("ProfileFragment")
                .commit()
        }
        binding.shop.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, ShopFragment())
                .addToBackStack("ShopFragment")
                .commit()
        }
        binding.cart.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, CartFragment())
                .addToBackStack("CartFragment")
                .commit()
        }

        return binding.root
    }


}