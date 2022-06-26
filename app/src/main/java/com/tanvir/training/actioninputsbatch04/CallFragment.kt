package com.tanvir.training.actioninputsbatch04

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tanvir.training.actioninputsbatch04.databinding.FragmentCallBinding

class CallFragment : Fragment() {
    private lateinit var binding: FragmentCallBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCallBinding.inflate(inflater, container, false)

        binding.dialBtn.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:2546515464")
                }
                startActivity(intent)
            }catch (e: ActivityNotFoundException) {
                Toast.makeText(requireActivity(), "could not launch app", Toast.LENGTH_SHORT).show()
            }
        }

        binding.smsBtn.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("smsto:39458908503")  // This ensures only SMS apps respond
                    putExtra("sms_body", "Hello")
                }
                startActivity(intent)
            }catch (e: ActivityNotFoundException) {
                Toast.makeText(requireActivity(), "could not launch app", Toast.LENGTH_SHORT).show()
            }
        }

        binding.emailBtn.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    type = "*/*"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@def.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Hello")
                    //putExtra(Intent.EXTRA_STREAM, attachment)
                }
                startActivity(intent)
            }catch (e: ActivityNotFoundException) {
                Toast.makeText(requireActivity(), "could not launch app", Toast.LENGTH_SHORT).show()
            }
        }

        binding.mapBtn.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("geo:0,0?q=EDB Trade Center, kawranbazar, Dhaka")
                }
                startActivity(intent)
            }catch (e: ActivityNotFoundException) {
                Toast.makeText(requireActivity(), "could not launch app", Toast.LENGTH_SHORT).show()
            }
        }

        binding.webBtn.setOnClickListener {
            try {
                val webpage: Uri = Uri.parse("https://www.developer.android.com")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)
            }catch (e: ActivityNotFoundException) {
                Toast.makeText(requireActivity(), "could not launch app", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}