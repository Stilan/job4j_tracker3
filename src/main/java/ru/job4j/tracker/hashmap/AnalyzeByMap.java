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
        Map<String, Integer> mapSum   = new LinkedHashMap<>();
        Map<String, Integer> mapCount = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                mapSum.merge(subject.name(), subject.score(), Integer::sum);
                mapCount.merge(subject.name(), 1, Integer::sum);
            }
        }

        List<Label> labels = new ArrayList<>();
        for (String name : mapSum.keySet()) {
            double avg = (double) mapSum.get(name) / mapCount.get(name);
            labels.add(new Label(name, avg));
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
                map.merge(subject.name(), subject.score(), Integer::sum
                );
            }
        }

        for (String str : map.keySet()) {
            labels.add(new Label(str, map.get(str)));
        }
        Collections.sort(labels, Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
