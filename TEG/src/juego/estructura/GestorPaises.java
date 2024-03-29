/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.estructura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heril
 */
public class GestorPaises {

    public static final int ALASKA = 0;
    public static final int ALBANIA = 1;
    public static final int ALEMANIA = 2;
    public static final int ANGOLA = 3;
    public static final int ARABIA = 4;
    public static final int ARGENTINA = 5;
    public static final int AUSTRALIA = 6;
    public static final int BIELORRUSIA = 7;
    public static final int BOLIVIA = 8;
    public static final int BRASIL = 9;
    public static final int CALIFORNIA = 10;
    public static final int CANADA = 11;
    public static final int COLOMBIA = 12;
    public static final int COREA = 13;
    public static final int CROACIA = 14;
    public static final int CUBA = 15;
    public static final int CHECHENIA = 16;
    public static final int CHICAGO = 17;
    public static final int CHILE = 18;
    public static final int CHINA = 19;
    public static final int CHUKCHI = 20;
    public static final int IRLANDA = 21;
    public static final int ETIOPIA = 22;
    public static final int EGIPTO = 23;
    public static final int EL_SALVADOR = 24;
    public static final int ESPANA = 25;
    public static final int FILIPINAS = 26;
    public static final int FINLANDIA = 27;
    public static final int FRANCIA = 28;
    public static final int GRAN_BRETANA = 29;
    public static final int GROENLANDIA = 30;
    public static final int HONDURAS = 31;
    public static final int INDIA = 32;
    public static final int IRAK = 33;
    public static final int IRAN = 34;
    public static final int ISLANDIA = 35;
    public static final int ISLA_VICTORIA = 36;
    public static final int ISRAEL = 37;
    public static final int ITALIA = 38;
    public static final int JAMAICA = 39;
    public static final int JAPON = 40;
    public static final int KAMTCHATKA = 41;
    public static final int FLORIDA = 42;
    public static final int LABRADOR = 43;
    public static final int LAS_VEGAS = 44;
    public static final int MADAGASCAR = 45;
    public static final int MALASIA = 46;
    public static final int MAURITANIA = 47;
    public static final int MEXICO = 48;
    public static final int NICARAGUA = 49;
    public static final int NIGERIA = 50;
    public static final int NORUEGA = 51;
    public static final int NUEVA_YORK = 52;
    public static final int NUEVA_ZELANDIA = 53;
    public static final int OREGON = 54;
    public static final int PARAGUAY = 55;
    public static final int UCRANIA = 56;
    public static final int PORTUGAL = 57;
    public static final int RUSIA = 58;
    public static final int SAHARA = 59;
    public static final int SERBIA = 60;
    public static final int SIBERIA = 61;
    public static final int SUDAFRICA = 62;
    public static final int SUMATRA = 63;
    public static final int TASMANIA = 64;
    public static final int TERRANOVA = 65;
    public static final int TONGA = 66;
    public static final int TURQUIA = 67;
    public static final int POLONIA = 68;
    public static final int URUGUAY = 69;
    public static final int VENEZUELA = 70;
    public static final int VIETNAM = 71;
    private static List<Pais> listaPaises = null;

    private static void esSimetrica() {
        boolean res = true;
        for (int i = 0; i < limitrofes.length; i++) {
            for (int j = 0; j < limitrofes.length; j++) {
                res = res && (limitrofes[i][j] == limitrofes[j][i]);
                if (limitrofes[i][j] != limitrofes[j][i]) {
                    System.out.println("Diferencia encontrada! i=" + i + ";j=" + j);
                }
            }
        }
        System.out.println("Es simetrica? --> " + res);
    }

    private static void imprimir() {
        System.out.println("\t0\t\t8\t\t16\t\t24\t\t32\t\t40\t\t48\t\t56\t\t64");
        for (int i = 0; i < limitrofes.length; i++) {
            System.out.print(i + ">\t");
            for (int j = 0; j < limitrofes.length; j++) {
                System.out.print(limitrofes[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void extenderLimites() {
        for (int i = 0; i < limitrofes.length; i++) {
            for (int j = 0; j < limitrofes.length; j++) {
                if (limitrofes[i][j] == 1) {
                }
            }
        }
    }
    private static int[][] limitrofes = null;

    public static boolean sonLimitrofes(Pais origen, Pais destino) {
        if (limitrofes == null) {
            armarEstructura();
        }
        return limitrofes[origen.getNroPais()][destino.getNroPais()] == 1;
    }

    public static int calcularDistancia(Pais origen, Pais destino) {
        return limitrofes[origen.getNroPais()][destino.getNroPais()];
    }

    private static List<Pais> crearPaises() {
        listaPaises = new ArrayList<>(72);
        listaPaises.add(new Pais(ALASKA, "Alaska", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(ALBANIA, "Albania", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(ALEMANIA, "Alemania", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(ANGOLA, "Angola", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(ARABIA, "Arabia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(ARGENTINA, "Argentina", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(AUSTRALIA, "Australia", GestorContinentes.getContinente(GestorContinentes.OCEANIA), false));
        listaPaises.add(new Pais(BIELORRUSIA, "Bielorrusia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(BOLIVIA, "Bolivia", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(BRASIL, "Brasil", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(CALIFORNIA, "California", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(CANADA, "Canada", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(COLOMBIA, "Colombia", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(COREA, "Corea", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(CROACIA, "Croacia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(CUBA, "Cuba", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), true));
        listaPaises.add(new Pais(CHECHENIA, "Chechenia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(CHICAGO, "Chicago", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(CHILE, "Chile", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(CHINA, "China", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(CHUKCHI, "Chukchi", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(IRLANDA, "Irlanda", GestorContinentes.getContinente(GestorContinentes.EUROPA), true));
        listaPaises.add(new Pais(ETIOPIA, "Etiopia", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(EGIPTO, "Egipto", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(EL_SALVADOR, "El Salvador", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), false));
        listaPaises.add(new Pais(ESPANA, "España", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(FILIPINAS, "Filipinas", GestorContinentes.getContinente(GestorContinentes.OCEANIA), true));
        listaPaises.add(new Pais(FINLANDIA, "Finlandia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(FRANCIA, "Francia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(GRAN_BRETANA, "Gran Bretaña", GestorContinentes.getContinente(GestorContinentes.EUROPA), true));
        listaPaises.add(new Pais(GROENLANDIA, "Groenlandia", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), true));
        listaPaises.add(new Pais(HONDURAS, "Honduras", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), false));
        listaPaises.add(new Pais(INDIA, "India", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(IRAK, "Irak", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(IRAN, "Iran", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(ISLANDIA, "Islandia", GestorContinentes.getContinente(GestorContinentes.EUROPA), true));
        listaPaises.add(new Pais(ISLA_VICTORIA, "Isla Victoria", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), true));
        listaPaises.add(new Pais(ISRAEL, "Israel", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(ITALIA, "Italia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(JAMAICA, "Jamaica", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), true));
        listaPaises.add(new Pais(JAPON, "Japon", GestorContinentes.getContinente(GestorContinentes.ASIA), true));
        listaPaises.add(new Pais(KAMTCHATKA, "Kamtchatka", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(FLORIDA, "Florida", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(LABRADOR, "Labrador", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), true));
        listaPaises.add(new Pais(LAS_VEGAS, "Las Vegas", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(MADAGASCAR, "Madagascar", GestorContinentes.getContinente(GestorContinentes.AFRICA), true));
        listaPaises.add(new Pais(MALASIA, "Malasia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(MAURITANIA, "Mauritania", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(MEXICO, "Mexico", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), false));
        listaPaises.add(new Pais(NICARAGUA, "Nicaragua", GestorContinentes.getContinente(GestorContinentes.AMERICA_CENTRAL), false));
        listaPaises.add(new Pais(NIGERIA, "Nigeria", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(NORUEGA, "Noruega", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(NUEVA_YORK, "Nueva York", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(NUEVA_ZELANDIA, "Nueva Zelandia", GestorContinentes.getContinente(GestorContinentes.OCEANIA), true));
        listaPaises.add(new Pais(OREGON, "Oregon", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(PARAGUAY, "Paraguay", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(UCRANIA, "Ucrania", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(PORTUGAL, "Portugal", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(RUSIA, "Rusia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(SAHARA, "Sahara", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(SERBIA, "Serbia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(SIBERIA, "Siberia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(SUDAFRICA, "Sudafrica", GestorContinentes.getContinente(GestorContinentes.AFRICA), false));
        listaPaises.add(new Pais(SUMATRA, "Sumatra", GestorContinentes.getContinente(GestorContinentes.OCEANIA), true));
        listaPaises.add(new Pais(TASMANIA, "Tasmania", GestorContinentes.getContinente(GestorContinentes.OCEANIA), true));
        listaPaises.add(new Pais(TERRANOVA, "Terranova", GestorContinentes.getContinente(GestorContinentes.AMERICA_NORTE), false));
        listaPaises.add(new Pais(TONGA, "Tonga", GestorContinentes.getContinente(GestorContinentes.OCEANIA), true));
        listaPaises.add(new Pais(TURQUIA, "Turquia", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        listaPaises.add(new Pais(POLONIA, "Polonia", GestorContinentes.getContinente(GestorContinentes.EUROPA), false));
        listaPaises.add(new Pais(URUGUAY, "Uruguay", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(VENEZUELA, "Venezuela", GestorContinentes.getContinente(GestorContinentes.AMERICA_SUR), false));
        listaPaises.add(new Pais(VIETNAM, "Vietnam", GestorContinentes.getContinente(GestorContinentes.ASIA), false));
        return listaPaises;
    }

    private static void armarEstructura() {
        limitrofes = new int[72][72];

        limitrofes[ALASKA][CHUKCHI] = 1;
        limitrofes[ALASKA][KAMTCHATKA] = 1;
        limitrofes[ALASKA][CANADA] = 1;

        limitrofes[ALBANIA][POLONIA] = 1;
        limitrofes[ALBANIA][UCRANIA] = 1;
        limitrofes[ALBANIA][IRAK] = 1;

        limitrofes[ALEMANIA][GRAN_BRETANA] = 1;
        limitrofes[ALEMANIA][FRANCIA] = 1;
        limitrofes[ALEMANIA][ITALIA] = 1;
        limitrofes[ALEMANIA][CROACIA] = 1;
        limitrofes[ALEMANIA][SERBIA] = 1;
        limitrofes[ALEMANIA][POLONIA] = 1;

        limitrofes[ANGOLA][ETIOPIA] = 1;
        limitrofes[ANGOLA][MAURITANIA] = 1;
        limitrofes[ANGOLA][NIGERIA] = 1;

        limitrofes[ARABIA][ISRAEL] = 1;

        limitrofes[ARGENTINA][CHILE] = 1;
        limitrofes[ARGENTINA][BRASIL] = 1;
        limitrofes[ARGENTINA][URUGUAY] = 1;
        limitrofes[ARGENTINA][PARAGUAY] = 1;
        limitrofes[ARGENTINA][BOLIVIA] = 1;

        limitrofes[AUSTRALIA][SUMATRA] = 1;
        limitrofes[AUSTRALIA][FILIPINAS] = 1;
        limitrofes[AUSTRALIA][TONGA] = 1;
        limitrofes[AUSTRALIA][CHILE] = 1;
        limitrofes[AUSTRALIA][TASMANIA] = 1;

        limitrofes[BIELORRUSIA][UCRANIA] = 1;
        limitrofes[BIELORRUSIA][POLONIA] = 1;
        limitrofes[BIELORRUSIA][FINLANDIA] = 1;

        limitrofes[BOLIVIA][CHILE] = 1;
        limitrofes[BOLIVIA][ARGENTINA] = 1;
        limitrofes[BOLIVIA][PARAGUAY] = 1;
        limitrofes[BOLIVIA][BRASIL] = 1;

        limitrofes[BRASIL][ARGENTINA] = 1;
        limitrofes[BRASIL][CHILE] = 1;
        limitrofes[BRASIL][BOLIVIA] = 1;
        limitrofes[BRASIL][COLOMBIA] = 1;
        limitrofes[BRASIL][VENEZUELA] = 1;
        limitrofes[BRASIL][URUGUAY] = 1;
        limitrofes[BRASIL][PARAGUAY] = 1;
        limitrofes[BRASIL][SAHARA] = 1;

        limitrofes[CALIFORNIA][MEXICO] = 1;
        limitrofes[CALIFORNIA][TONGA] = 1;
        limitrofes[CALIFORNIA][FLORIDA] = 1;
        limitrofes[CALIFORNIA][LAS_VEGAS] = 1;

        limitrofes[CANADA][ALASKA] = 1;
        limitrofes[CANADA][ISLA_VICTORIA] = 1;
        limitrofes[CANADA][TERRANOVA] = 1;
        limitrofes[CANADA][OREGON] = 1;

        limitrofes[COLOMBIA][BRASIL] = 1;
        limitrofes[COLOMBIA][VENEZUELA] = 1;
        limitrofes[COLOMBIA][CHILE] = 1;
        limitrofes[COLOMBIA][NICARAGUA] = 1;

        limitrofes[COREA][JAPON] = 1;
        limitrofes[COREA][KAMTCHATKA] = 1;
        limitrofes[COREA][CHINA] = 1;
        limitrofes[COREA][MALASIA] = 1;
        limitrofes[COREA][VIETNAM] = 1;

        limitrofes[CROACIA][ITALIA] = 1;
        limitrofes[CROACIA][ALEMANIA] = 1;
        limitrofes[CROACIA][SERBIA] = 1;
        limitrofes[CROACIA][POLONIA] = 1;

        limitrofes[CUBA][FLORIDA] = 1;
        limitrofes[CUBA][MEXICO] = 1;
        limitrofes[CUBA][HONDURAS] = 1;
        limitrofes[CUBA][JAMAICA] = 1;

        limitrofes[CHECHENIA][RUSIA] = 1;
        limitrofes[CHECHENIA][CHINA] = 1;
        limitrofes[CHECHENIA][SIBERIA] = 1;

        limitrofes[CHICAGO][FLORIDA] = 1;
        limitrofes[CHICAGO][LAS_VEGAS] = 1;
        limitrofes[CHICAGO][OREGON] = 1;
        limitrofes[CHICAGO][TERRANOVA] = 1;
        limitrofes[CHICAGO][NUEVA_YORK] = 1;

        limitrofes[CHILE][ARGENTINA] = 1;
        limitrofes[CHILE][COLOMBIA] = 1;
        limitrofes[CHILE][BRASIL] = 1;
        limitrofes[CHILE][BOLIVIA] = 1;
        limitrofes[CHILE][AUSTRALIA] = 1;

        limitrofes[CHINA][SIBERIA] = 1;
        limitrofes[CHINA][CHECHENIA] = 1;
        limitrofes[CHINA][RUSIA] = 1;
        limitrofes[CHINA][TURQUIA] = 1;
        limitrofes[CHINA][INDIA] = 1;
        limitrofes[CHINA][MALASIA] = 1;
        limitrofes[CHINA][COREA] = 1;
        limitrofes[CHINA][KAMTCHATKA] = 1;
        limitrofes[CHINA][CHUKCHI] = 1;

        limitrofes[CHUKCHI][CHINA] = 1;
        limitrofes[CHUKCHI][ALASKA] = 1;
        limitrofes[CHUKCHI][KAMTCHATKA] = 1;

        limitrofes[IRLANDA][ISLANDIA] = 1;
        limitrofes[IRLANDA][GRAN_BRETANA] = 1;

        limitrofes[ETIOPIA][EGIPTO] = 1;
        limitrofes[ETIOPIA][SAHARA] = 1;
        limitrofes[ETIOPIA][NIGERIA] = 1;
        limitrofes[ETIOPIA][ANGOLA] = 1;

        limitrofes[EGIPTO][SAHARA] = 1;
        limitrofes[EGIPTO][ETIOPIA] = 1;
        limitrofes[EGIPTO][MADAGASCAR] = 1;
        limitrofes[EGIPTO][POLONIA] = 1;
        limitrofes[EGIPTO][IRAK] = 1;
        limitrofes[EGIPTO][ISRAEL] = 1;

        limitrofes[EL_SALVADOR][NICARAGUA] = 1;
        limitrofes[EL_SALVADOR][HONDURAS] = 1;

        limitrofes[ESPANA][PORTUGAL] = 1;
        limitrofes[ESPANA][SAHARA] = 1;
        limitrofes[ESPANA][FRANCIA] = 1;

        limitrofes[FILIPINAS][AUSTRALIA] = 1;
        limitrofes[FILIPINAS][VIETNAM] = 1;
        limitrofes[FILIPINAS][TONGA] = 1;

        limitrofes[FINLANDIA][BIELORRUSIA] = 1;
        limitrofes[FINLANDIA][NORUEGA] = 1;

        limitrofes[FRANCIA][ESPANA] = 1;
        limitrofes[FRANCIA][ITALIA] = 1;
        limitrofes[FRANCIA][ALEMANIA] = 1;

        limitrofes[GRAN_BRETANA][IRLANDA] = 1;
        limitrofes[GRAN_BRETANA][PORTUGAL] = 1;
        limitrofes[GRAN_BRETANA][ALEMANIA] = 1;

        limitrofes[GROENLANDIA][ISLANDIA] = 1;
        limitrofes[GROENLANDIA][ISLA_VICTORIA] = 1;
        limitrofes[GROENLANDIA][LABRADOR] = 1;
        limitrofes[GROENLANDIA][NUEVA_YORK] = 1;

        limitrofes[HONDURAS][CUBA] = 1;
        limitrofes[HONDURAS][MEXICO] = 1;
        limitrofes[HONDURAS][EL_SALVADOR] = 1;

        limitrofes[INDIA][SUMATRA] = 1;
        limitrofes[INDIA][TURQUIA] = 1;
        limitrofes[INDIA][CHINA] = 1;
        limitrofes[INDIA][MALASIA] = 1;
        limitrofes[INDIA][VIETNAM] = 1;

        limitrofes[IRAK][UCRANIA] = 1;
        limitrofes[IRAK][ALBANIA] = 1;
        limitrofes[IRAK][EGIPTO] = 1;
        limitrofes[IRAK][ISRAEL] = 1;
        limitrofes[IRAK][TURQUIA] = 1;
        limitrofes[IRAK][IRAN] = 1;

        limitrofes[IRAN][RUSIA] = 1;
        limitrofes[IRAN][TURQUIA] = 1;
        limitrofes[IRAN][IRAK] = 1;
        limitrofes[IRAN][UCRANIA] = 1;

        limitrofes[ISLANDIA][GROENLANDIA] = 1;
        limitrofes[ISLANDIA][NORUEGA] = 1;
        limitrofes[ISLANDIA][IRLANDA] = 1;

        limitrofes[ISLA_VICTORIA][CANADA] = 1;
        limitrofes[ISLA_VICTORIA][GROENLANDIA] = 1;

        limitrofes[ISRAEL][IRAK] = 1;
        limitrofes[ISRAEL][TURQUIA] = 1;
        limitrofes[ISRAEL][ARABIA] = 1;
        limitrofes[ISRAEL][EGIPTO] = 1;

        limitrofes[ITALIA][FRANCIA] = 1;
        limitrofes[ITALIA][ALEMANIA] = 1;
        limitrofes[ITALIA][CROACIA] = 1;

        limitrofes[JAMAICA][NICARAGUA] = 1;
        limitrofes[JAMAICA][CUBA] = 1;

        limitrofes[JAPON][COREA] = 1;
        limitrofes[JAPON][KAMTCHATKA] = 1;

        limitrofes[KAMTCHATKA][JAPON] = 1;
        limitrofes[KAMTCHATKA][ALASKA] = 1;
        limitrofes[KAMTCHATKA][CHINA] = 1;
        limitrofes[KAMTCHATKA][COREA] = 1;
        limitrofes[KAMTCHATKA][CHUKCHI] = 1;

        limitrofes[FLORIDA][CHICAGO] = 1;
        limitrofes[FLORIDA][LAS_VEGAS] = 1;
        limitrofes[FLORIDA][CALIFORNIA] = 1;
        limitrofes[FLORIDA][CUBA] = 1;

        limitrofes[LABRADOR][GROENLANDIA] = 1;
        limitrofes[LABRADOR][TERRANOVA] = 1;

        limitrofes[LAS_VEGAS][OREGON] = 1;
        limitrofes[LAS_VEGAS][CHICAGO] = 1;
        limitrofes[LAS_VEGAS][FLORIDA] = 1;
        limitrofes[LAS_VEGAS][CALIFORNIA] = 1;

        limitrofes[MADAGASCAR][EGIPTO] = 1;
        limitrofes[MADAGASCAR][MAURITANIA] = 1;
        limitrofes[MADAGASCAR][SUDAFRICA] = 1;

        limitrofes[MALASIA][CHINA] = 1;
        limitrofes[MALASIA][INDIA] = 1;
        limitrofes[MALASIA][VIETNAM] = 1;
        limitrofes[MALASIA][COREA] = 1;

        limitrofes[MAURITANIA][SUDAFRICA] = 1;
        limitrofes[MAURITANIA][NIGERIA] = 1;
        limitrofes[MAURITANIA][ANGOLA] = 1;
        limitrofes[MAURITANIA][MADAGASCAR] = 1;

        limitrofes[MEXICO][CALIFORNIA] = 1;
        limitrofes[MEXICO][CUBA] = 1;
        limitrofes[MEXICO][HONDURAS] = 1;

        limitrofes[NICARAGUA][EL_SALVADOR] = 1;
        limitrofes[NICARAGUA][JAMAICA] = 1;
        limitrofes[NICARAGUA][COLOMBIA] = 1;

        limitrofes[NIGERIA][SAHARA] = 1;
        limitrofes[NIGERIA][ETIOPIA] = 1;
        limitrofes[NIGERIA][ANGOLA] = 1;
        limitrofes[NIGERIA][MAURITANIA] = 1;
        limitrofes[NIGERIA][SUDAFRICA] = 1;
        limitrofes[NIGERIA][URUGUAY] = 1;

        limitrofes[NORUEGA][ISLANDIA] = 1;
        limitrofes[NORUEGA][FINLANDIA] = 1;

        limitrofes[NUEVA_YORK][GROENLANDIA] = 1;
        limitrofes[NUEVA_YORK][CHICAGO] = 1;

        limitrofes[NUEVA_ZELANDIA][TASMANIA] = 1;

        limitrofes[OREGON][CANADA] = 1;
        limitrofes[OREGON][TERRANOVA] = 1;
        limitrofes[OREGON][CHICAGO] = 1;
        limitrofes[OREGON][LAS_VEGAS] = 1;

        limitrofes[PARAGUAY][ARGENTINA] = 1;
        limitrofes[PARAGUAY][BOLIVIA] = 1;
        limitrofes[PARAGUAY][BRASIL] = 1;

        limitrofes[UCRANIA][BIELORRUSIA] = 1;
        limitrofes[UCRANIA][POLONIA] = 1;
        limitrofes[UCRANIA][ALBANIA] = 1;
        limitrofes[UCRANIA][IRAK] = 1;
        limitrofes[UCRANIA][IRAN] = 1;
        limitrofes[UCRANIA][RUSIA] = 1;

        limitrofes[PORTUGAL][ESPANA] = 1;
        limitrofes[PORTUGAL][GRAN_BRETANA] = 1;

        limitrofes[RUSIA][SIBERIA] = 1;
        limitrofes[RUSIA][CHECHENIA] = 1;
        limitrofes[RUSIA][CHINA] = 1;
        limitrofes[RUSIA][TURQUIA] = 1;
        limitrofes[RUSIA][IRAN] = 1;
        limitrofes[RUSIA][UCRANIA] = 1;

        limitrofes[SAHARA][ESPANA] = 1;
        limitrofes[SAHARA][BRASIL] = 1;
        limitrofes[SAHARA][ETIOPIA] = 1;
        limitrofes[SAHARA][NIGERIA] = 1;
        limitrofes[SAHARA][EGIPTO] = 1;

        limitrofes[SERBIA][CROACIA] = 1;
        limitrofes[SERBIA][ALEMANIA] = 1;
        limitrofes[SERBIA][POLONIA] = 1;

        limitrofes[SIBERIA][CHECHENIA] = 1;
        limitrofes[SIBERIA][RUSIA] = 1;
        limitrofes[SIBERIA][CHINA] = 1;

        limitrofes[SUDAFRICA][MAURITANIA] = 1;
        limitrofes[SUDAFRICA][MADAGASCAR] = 1;
        limitrofes[SUDAFRICA][NIGERIA] = 1;

        limitrofes[SUMATRA][INDIA] = 1;
        limitrofes[SUMATRA][AUSTRALIA] = 1;

        limitrofes[TASMANIA][AUSTRALIA] = 1;
        limitrofes[TASMANIA][NUEVA_ZELANDIA] = 1;

        limitrofes[TERRANOVA][LABRADOR] = 1;
        limitrofes[TERRANOVA][CANADA] = 1;
        limitrofes[TERRANOVA][OREGON] = 1;
        limitrofes[TERRANOVA][CHICAGO] = 1;

        limitrofes[TONGA][CALIFORNIA] = 1;
        limitrofes[TONGA][AUSTRALIA] = 1;
        limitrofes[TONGA][FILIPINAS] = 1;

        limitrofes[TURQUIA][RUSIA] = 1;
        limitrofes[TURQUIA][IRAN] = 1;
        limitrofes[TURQUIA][IRAK] = 1;
        limitrofes[TURQUIA][ISRAEL] = 1;
        limitrofes[TURQUIA][INDIA] = 1;
        limitrofes[TURQUIA][CHINA] = 1;

        limitrofes[POLONIA][BIELORRUSIA] = 1;
        limitrofes[POLONIA][UCRANIA] = 1;
        limitrofes[POLONIA][ALBANIA] = 1;
        limitrofes[POLONIA][EGIPTO] = 1;
        limitrofes[POLONIA][CROACIA] = 1;
        limitrofes[POLONIA][SERBIA] = 1;
        limitrofes[POLONIA][ALEMANIA] = 1;

        limitrofes[URUGUAY][NIGERIA] = 1;
        limitrofes[URUGUAY][BRASIL] = 1;
        limitrofes[URUGUAY][ARGENTINA] = 1;

        limitrofes[VENEZUELA][COLOMBIA] = 1;
        limitrofes[VENEZUELA][BRASIL] = 1;

        limitrofes[VIETNAM][COREA] = 1;
        limitrofes[VIETNAM][MALASIA] = 1;
        limitrofes[VIETNAM][INDIA] = 1;
        limitrofes[VIETNAM][FILIPINAS] = 1;

        completarDistancias();
    }

    public static List<Pais> obtenerLimitrofes(Pais pais) {
        List<Pais> listaLimitrofes = new ArrayList<>();
        for (int i = 0; i < limitrofes[0].length; i++) {
            if (limitrofes[pais.getNroPais()][i] == 1) {
                Pais limitrofe = getPais(i);
                listaLimitrofes.add(limitrofe);
            }
        }
        return listaLimitrofes;
    }

    private static void completarDistancias() {
        int provisorio[];
        for (int pasadas = 0; pasadas < 10; pasadas++) {
            for (int i = 0; i < limitrofes.length; i++) {
                for (int j = 0; j < limitrofes[i].length; j++) {
                    if (j == i || limitrofes[i][j] == 0) {
                        continue;
                    } else if (limitrofes[i][j] == 1) {
                        provisorio = limitrofes[j];
                        for (int k = 0; k < provisorio.length; k++) {
                            if (provisorio[k] > 0 && provisorio[k] <= 2) {
                                if (limitrofes[i][k] > provisorio[k] || limitrofes[i][k] == 0) {
                                    if (i != k) {
                                        limitrofes[i][k] = provisorio[k] + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

//    public static void main(String args[]) {
//        armarEstructura();
//        extenderLimites();
//        esSimetrica();
//        imprimir();
//        calcularDistancia();
//        imprimir();
//    }
    public static List<Pais> getListaPaises() {
        if (listaPaises == null) {
            inicializarGestor();
        }
        return listaPaises;
    }

    public static Pais getPais(int pais) {
        if (listaPaises == null) {
            inicializarGestor();
        }
        return listaPaises.get(pais);
    }

    public static void inicializarGestor() {
        crearPaises();
        armarEstructura();
    }

    public static void setPaises(List<Pais> paises) {
        listaPaises = paises;
        armarEstructura();
    }
}
