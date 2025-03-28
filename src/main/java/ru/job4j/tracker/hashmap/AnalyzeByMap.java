package ru.job4j.tracker.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sumSubject = 0;
        double sumPassages = 0;
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sumSubject += subject.score();
                sumPassages++;
            }
        }
        return sumSubject / sumPassages;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        double sumPupil = 0;
        double sumPassages = 0;
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sumPupil += subject.score();
                sumPassages++;
            }
            labels.add(new Label(pupil.name(), sumPupil / sumPassages));
            sumPupil = 0;
            sumPassages = 0;
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        int total = 0;
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                int scoreSum = map.getOrDefault(subject.name(), 0);
                if (scoreSum == 0) {
                    total++;
                }
                map.put(subject.name(), subject.score() + scoreSum);
            }
        }

        for (String str : map.keySet()) {
            labels.add(new Label(str, (double) map.get(str) / total));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        double sumPupil = 0;
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sumPupil += subject.score();
            }
            labels.add(new Label(pupil.name(), sumPupil));
            sumPupil = 0;
        }
        Collections.sort(labels, Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                int scoreSum = map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), subject.score() + scoreSum);
            }
        }

        for (String str : map.keySet()) {
            labels.add(new Label(str, map.get(str)));
        }
        Collections.sort(labels, Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
