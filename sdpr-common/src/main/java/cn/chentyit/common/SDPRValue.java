package cn.chentyit.common;

import cn.chentyit.pojo.Scholar;
import cn.chentyit.pojo.Thesis;

import java.util.*;

/**
 * @ClassName
 * @Description 这些是用于计算学者和机构排名的期刊或者会议的权值
 * @Author Chentyit
 * @Date 2019/4/18 15:07
 * @Version 1.0
 */
public class SDPRValue {

    /**
     * 这里是期刊的权值
     */
    public static final double TSE = 3.0;
    public static final double TOSEM = 3.0;
    public static final double JSS = 1.8;
    public static final double IST = 1.8;
    public static final double ESEM = 1.8;
    public static final double STVR = 1.8;

    /**
     * 这里是会议的权值
     */
    public static final double ICSE = 2.5;
    public static final double FSE = 2.5;
    public static final double ASE = 1.5;
    public static final double ISSTA = 1.5;
    public static final double ISSRE = 1.5;
    public static final double ICSM = 1.5;
    public static final double PROMISE = 1.0;

    public static double getScore(Integer[] value) {
        return value[0] * SDPRValue.TSE +
                value[1] * SDPRValue.TOSEM +
                value[2] * SDPRValue.JSS +
                value[3] * SDPRValue.IST +
                value[4] * SDPRValue.ESEM +
                value[5] * SDPRValue.STVR +
                value[6] * SDPRValue.ICSE +
                value[7] * SDPRValue.FSE +
                value[8] * SDPRValue.ASE +
                value[9] * SDPRValue.ISSTA +
                value[10] * SDPRValue.ISSRE +
                value[11] * SDPRValue.ICSM +
                value[12] * SDPRValue.PROMISE;
    }

    /**
     * 获取作者在每个出版社发的论文数量
     */
    public static List<List<String>> findArticleCountOFPublisher(Map<String, List<Thesis>> listMap) {
        List<List<String>> results = new ArrayList<>();
        for (String name : listMap.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(name);
            Integer[] data = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            List<Thesis> thesisList = listMap.get(name);
            for (Thesis thesis : thesisList) {
                if (thesis.getThesisJournal() != null) {
                    switch (thesis.getThesisJournal()) {
                        case "TSE":
                            data[0]++;
                            break;
                        case "TOSEM":
                            data[1]++;
                            break;
                        case "JSS":
                            data[2]++;
                            break;
                        case "IST":
                            data[3]++;
                            break;
                        case "ESEM":
                            data[4]++;
                            break;
                        case "STVR":
                            data[5]++;
                            break;
                        default:
                            break;
                    }
                }
                if (thesis.getThesisOrganization() != null) {
                    switch (thesis.getThesisOrganization()) {
                        case "ICSE":
                            data[6]++;
                            break;
                        case "FSE":
                            data[7]++;
                            break;
                        case "ASE":
                            data[8]++;
                            break;
                        case "ISSTA":
                            data[9]++;
                            break;
                        case "ISSRE":
                            data[10]++;
                            break;
                        case "ICSM":
                            data[11]++;
                            break;
                        case "PROMISE":
                            data[12]++;
                            break;
                        default:
                            break;
                    }
                }
            }
            for (int n : data) {
                row.add(String.valueOf(n));
            }
            row.add(String.valueOf(SDPRValue.getScore(data)));
            results.add(row);
        }
        results.sort((List<String> o1, List<String> o2) -> (int) (Double.parseDouble(o2.get(o2.size() - 1)) * 10 - Double.parseDouble(o1.get(o1.size() - 1)) * 10));
        int end = results.size() >= 30 ? 30 : 20;
        return results.subList(0, end);
    }

    /**
     * 按照姓氏首字母排序
     * @param scholarLastNames
     * @return
     */
    public static Map<String, List<String>> lastNameSortByAlphabet(List<Scholar> scholarLastNames) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        List<String> C = new ArrayList<>();
        List<String> D = new ArrayList<>();
        List<String> E = new ArrayList<>();
        List<String> F = new ArrayList<>();
        List<String> G = new ArrayList<>();
        List<String> H = new ArrayList<>();
        List<String> I = new ArrayList<>();
        List<String> J = new ArrayList<>();
        List<String> K = new ArrayList<>();
        List<String> L = new ArrayList<>();
        List<String> M = new ArrayList<>();
        List<String> N = new ArrayList<>();
        List<String> O = new ArrayList<>();
        List<String> P = new ArrayList<>();
        List<String> Q = new ArrayList<>();
        List<String> R = new ArrayList<>();
        List<String> S = new ArrayList<>();
        List<String> T = new ArrayList<>();
        List<String> U = new ArrayList<>();
        List<String> V = new ArrayList<>();
        List<String> W = new ArrayList<>();
        List<String> X = new ArrayList<>();
        List<String> Y = new ArrayList<>();
        List<String> Z = new ArrayList<>();
        for (int i = 0; i < scholarLastNames.size(); i++) {
            switch (scholarLastNames.get(i).getScholarLastName().charAt(0)) {
                case 'A':
                    A.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'B':
                    B.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'C':
                    C.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'D':
                    D.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'E':
                    E.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'F':
                    F.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'G':
                    G.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'H':
                    H.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'I':
                    I.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'J':
                    J.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'K':
                    K.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'L':
                    L.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'M':
                    M.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'N':
                    N.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'O':
                    O.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'P':
                    P.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'Q':
                    Q.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'R':
                    R.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'S':
                    S.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'T':
                    T.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'U':
                    U.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'V':
                    V.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'W':
                    W.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'X':
                    X.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'Y':
                    Y.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                case 'Z':
                    Z.add(scholarLastNames.get(i).getScholarLastName());
                    break;
                default:
                    break;
            }
        }
        result.put("A", A);
        result.put("B", B);
        result.put("C", C);
        result.put("D", D);
        result.put("E", E);
        result.put("F", F);
        result.put("G", G);
        result.put("H", H);
        result.put("I", I);
        result.put("J", J);
        result.put("K", K);
        result.put("L", L);
        result.put("M", M);
        result.put("N", N);
        result.put("O", O);
        result.put("P", P);
        result.put("Q", Q);
        result.put("R", R);
        result.put("S", S);
        result.put("T", T);
        result.put("U", U);
        result.put("V", V);
        result.put("W", W);
        result.put("X", X);
        result.put("Y", Y);
        result.put("Z", Z);
        return result;
    }
}
