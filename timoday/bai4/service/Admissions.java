package timoday.bai4.service;

import java.util.ArrayList;
import timoday.bai4.entity.Candidate;

public class  Admissions {

    public static ArrayList<Candidate> candidates = new ArrayList<Candidate>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void displayACandidate(Candidate candidate) {
        System.out.println(candidate);
    }

    public void findByidentificationNumber(String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getIdentificationNumber() == id) {
                System.out.println(candidate);
            }
        }
    }
}
