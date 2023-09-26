package com.example.donation.service;

import com.example.donation.dto.Donation;
import com.example.donation.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public void saveDonation(Donation donation) {
        donationRepository.save(donation);
    }
}

