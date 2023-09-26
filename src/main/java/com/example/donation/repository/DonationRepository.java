package com.example.donation.repository;

import com.example.donation.dto.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    // 추가적인 데이터베이스 쿼리 메서드 정의 가능
}


