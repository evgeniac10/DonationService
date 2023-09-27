package com.example.donation.controller;

import com.example.donation.dto.Donation;
import com.example.donation.dto.User;
import com.example.donation.repository.UserRepository;
import com.example.donation.service.DonationService;
import com.example.donation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/donations")
public class DonationController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String loginPageForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user){
        userService.saveUser(user);
        return "redirect:/list";
    }

    @Autowired
    private DonationService donationService;

    @GetMapping("/list")
    public String listDonations(Model model) {
            List<Donation> donations = donationService.getAllDonations();
            model.addAttribute("donation", donations);
            return "donation/list"; // 뷰 템플릿 이름
        }

        @GetMapping("/create")
        public String createDonationForm(Model model) {
            Donation donation = new Donation();
            model.addAttribute("donation", donation);
            return "donation/create"; // 뷰 템플릿 이름
        }

        @PostMapping("/create")
        public String createDonation(@ModelAttribute("donation") Donation donation) {
            donationService.saveDonation(donation);
            return "redirect:/donations/list";
        }
    }


