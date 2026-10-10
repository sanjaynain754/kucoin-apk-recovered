package com.jumio.sdk.util;

import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.otc.entity.OtcAd;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/sdk/util/IsoCountryConverter;", "", "<init>", "()V", "localeMap", "", "", "convertToAlpha2", "alpha3Code", "convertToAlpha3", "alpha2Code", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsoCountryConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsoCountryConverter.kt\ncom/jumio/sdk/util/IsoCountryConverter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,279:1\n503#2,7:280\n*S KotlinDebug\n*F\n+ 1 IsoCountryConverter.kt\ncom/jumio/sdk/util/IsoCountryConverter\n*L\n276#1:280,7\n*E\n"})
public final class IsoCountryConverter {

    @NotNull
    public static final IsoCountryConverter INSTANCE = new IsoCountryConverter();

    /* JADX INFO: renamed from: a */
    public static final Map f14750a = MapsKt.mapOf(TuplesKt.m90091to("AFG", "AF"), TuplesKt.m90091to("ALA", "AX"), TuplesKt.m90091to("ALB", "AL"), TuplesKt.m90091to("DZA", "DZ"), TuplesKt.m90091to("ASM", "AS"), TuplesKt.m90091to("AND", "AD"), TuplesKt.m90091to("AGO", "AO"), TuplesKt.m90091to("AIA", "AI"), TuplesKt.m90091to("ATA", "AQ"), TuplesKt.m90091to("ATG", "AG"), TuplesKt.m90091to("ARG", "AR"), TuplesKt.m90091to("ARM", "AM"), TuplesKt.m90091to("ABW", "AW"), TuplesKt.m90091to("AUS", "AU"), TuplesKt.m90091to("AUT", "AT"), TuplesKt.m90091to("AZE", "AZ"), TuplesKt.m90091to("BHS", "BS"), TuplesKt.m90091to("BHR", "BH"), TuplesKt.m90091to("BGD", "BD"), TuplesKt.m90091to("BRB", "BB"), TuplesKt.m90091to("BLR", "BY"), TuplesKt.m90091to("BEL", "BE"), TuplesKt.m90091to("BLZ", "BZ"), TuplesKt.m90091to("BEN", "BJ"), TuplesKt.m90091to("BMU", "BM"), TuplesKt.m90091to("BTN", "BT"), TuplesKt.m90091to("BOL", "BO"), TuplesKt.m90091to("BES", "BQ"), TuplesKt.m90091to("BIH", "BA"), TuplesKt.m90091to("BWA", "BW"), TuplesKt.m90091to("BVT", "BV"), TuplesKt.m90091to("BRA", "BR"), TuplesKt.m90091to("IOT", "IO"), TuplesKt.m90091to("BRN", "BN"), TuplesKt.m90091to("BGR", "BG"), TuplesKt.m90091to("BFA", "BF"), TuplesKt.m90091to("BDI", "BI"), TuplesKt.m90091to("KHM", "KH"), TuplesKt.m90091to("CMR", "CM"), TuplesKt.m90091to("CAN", "CA"), TuplesKt.m90091to("CPV", "CV"), TuplesKt.m90091to("CYM", "KY"), TuplesKt.m90091to("CAF", "CF"), TuplesKt.m90091to("TCD", "TD"), TuplesKt.m90091to("CHL", "CL"), TuplesKt.m90091to("CHN", "CN"), TuplesKt.m90091to("CXR", "CX"), TuplesKt.m90091to("CCK", "CC"), TuplesKt.m90091to("COL", "CO"), TuplesKt.m90091to("COM", "KM"), TuplesKt.m90091to("COG", "CG"), TuplesKt.m90091to("COD", "CD"), TuplesKt.m90091to("COK", "CK"), TuplesKt.m90091to("CRI", "CR"), TuplesKt.m90091to("CIV", "CI"), TuplesKt.m90091to("HRV", "HR"), TuplesKt.m90091to("CUB", "CU"), TuplesKt.m90091to("CUW", "CW"), TuplesKt.m90091to("CYP", "CY"), TuplesKt.m90091to("CZE", "CZ"), TuplesKt.m90091to("DNK", "DK"), TuplesKt.m90091to("DJI", "DJ"), TuplesKt.m90091to("DMA", "DM"), TuplesKt.m90091to("DOM", "DO"), TuplesKt.m90091to("ECU", "EC"), TuplesKt.m90091to("EGY", "EG"), TuplesKt.m90091to("SLV", "SV"), TuplesKt.m90091to("GNQ", "GQ"), TuplesKt.m90091to("ERI", "ER"), TuplesKt.m90091to("EST", "EE"), TuplesKt.m90091to("ETH", "ET"), TuplesKt.m90091to("FLK", "FK"), TuplesKt.m90091to("FRO", "FO"), TuplesKt.m90091to("FJI", "FJ"), TuplesKt.m90091to("FIN", "FI"), TuplesKt.m90091to("FRA", "FR"), TuplesKt.m90091to("GUF", "GF"), TuplesKt.m90091to("PYF", "PF"), TuplesKt.m90091to("ATF", "TF"), TuplesKt.m90091to("GAB", "GA"), TuplesKt.m90091to("GMB", "GM"), TuplesKt.m90091to("GEO", "GE"), TuplesKt.m90091to("DEU", "DE"), TuplesKt.m90091to("GHA", "GH"), TuplesKt.m90091to("GIB", "GI"), TuplesKt.m90091to("GRC", "GR"), TuplesKt.m90091to("GRL", "GL"), TuplesKt.m90091to("GRD", "GD"), TuplesKt.m90091to("GLP", "GP"), TuplesKt.m90091to("GUM", "GU"), TuplesKt.m90091to("GTM", "GT"), TuplesKt.m90091to("GGY", "GG"), TuplesKt.m90091to("GIN", "GN"), TuplesKt.m90091to("GNB", "GW"), TuplesKt.m90091to("GUY", "GY"), TuplesKt.m90091to("HTI", "HT"), TuplesKt.m90091to("HMD", "HM"), TuplesKt.m90091to("VAT", "VA"), TuplesKt.m90091to("HND", "HN"), TuplesKt.m90091to("HKG", "HK"), TuplesKt.m90091to("HUN", "HU"), TuplesKt.m90091to("ISL", "IS"), TuplesKt.m90091to("IND", "IN"), TuplesKt.m90091to("IDN", "ID"), TuplesKt.m90091to("IRN", "IR"), TuplesKt.m90091to("IRQ", "IQ"), TuplesKt.m90091to("IRL", "IE"), TuplesKt.m90091to("IMN", "IM"), TuplesKt.m90091to("ISR", "IL"), TuplesKt.m90091to("ITA", "IT"), TuplesKt.m90091to("JAM", "JM"), TuplesKt.m90091to("JPN", "JP"), TuplesKt.m90091to("JEY", "JE"), TuplesKt.m90091to("JOR", "JO"), TuplesKt.m90091to("KAZ", "KZ"), TuplesKt.m90091to("KEN", "KE"), TuplesKt.m90091to("KIR", "KI"), TuplesKt.m90091to("PRK", "KP"), TuplesKt.m90091to("KOR", "KR"), TuplesKt.m90091to("KWT", "KW"), TuplesKt.m90091to("KGZ", ExpandedProductParsedResult.KILOGRAM), TuplesKt.m90091to("LAO", "LA"), TuplesKt.m90091to("LVA", "LV"), TuplesKt.m90091to("LBN", ExpandedProductParsedResult.POUND), TuplesKt.m90091to("LSO", "LS"), TuplesKt.m90091to("LBR", "LR"), TuplesKt.m90091to("LBY", "LY"), TuplesKt.m90091to("LIE", "LI"), TuplesKt.m90091to("LTU", "LT"), TuplesKt.m90091to("LUX", "LU"), TuplesKt.m90091to("MAC", "MO"), TuplesKt.m90091to("MKD", "MK"), TuplesKt.m90091to("MDG", "MG"), TuplesKt.m90091to("MWI", "MW"), TuplesKt.m90091to("MYS", "MY"), TuplesKt.m90091to("MDV", "MV"), TuplesKt.m90091to("MLI", "ML"), TuplesKt.m90091to("MLT", "MT"), TuplesKt.m90091to("MHL", "MH"), TuplesKt.m90091to("MTQ", "MQ"), TuplesKt.m90091to("MRT", "MR"), TuplesKt.m90091to("MUS", "MU"), TuplesKt.m90091to("MYT", "YT"), TuplesKt.m90091to("MEX", "MX"), TuplesKt.m90091to("FSM", "FM"), TuplesKt.m90091to("MDA", "MD"), TuplesKt.m90091to("MCO", "MC"), TuplesKt.m90091to("MNG", "MN"), TuplesKt.m90091to("MNE", "ME"), TuplesKt.m90091to("MSR", "MS"), TuplesKt.m90091to("MAR", "MA"), TuplesKt.m90091to("MOZ", "MZ"), TuplesKt.m90091to("MMR", "MM"), TuplesKt.m90091to("NAM", "NA"), TuplesKt.m90091to("NRU", "NR"), TuplesKt.m90091to("NPL", "NP"), TuplesKt.m90091to("NLD", "NL"), TuplesKt.m90091to("ANT", "AN"), TuplesKt.m90091to("NCL", "NC"), TuplesKt.m90091to("NZL", "NZ"), TuplesKt.m90091to("NIC", "NI"), TuplesKt.m90091to("NER", "NE"), TuplesKt.m90091to("NGA", "NG"), TuplesKt.m90091to("NIU", "NU"), TuplesKt.m90091to("NFK", "NF"), TuplesKt.m90091to("MNP", "MP"), TuplesKt.m90091to("NOR", OtcAd.KYC_NO), TuplesKt.m90091to("OMN", "OM"), TuplesKt.m90091to("PAK", "PK"), TuplesKt.m90091to("PLW", "PW"), TuplesKt.m90091to("PSE", "PS"), TuplesKt.m90091to("PAN", "PA"), TuplesKt.m90091to(ConstantsKt.FILE_TYPE_PNG, "PG"), TuplesKt.m90091to("PRY", "PY"), TuplesKt.m90091to("PER", "PE"), TuplesKt.m90091to("PHL", "PH"), TuplesKt.m90091to("PCN", "PN"), TuplesKt.m90091to("POL", "PL"), TuplesKt.m90091to("PRT", "PT"), TuplesKt.m90091to("PRI", "PR"), TuplesKt.m90091to("QAT", "QA"), TuplesKt.m90091to("REU", "RE"), TuplesKt.m90091to("ROU", "RO"), TuplesKt.m90091to("RUS", "RU"), TuplesKt.m90091to("RWA", "RW"), TuplesKt.m90091to("BLM", "BL"), TuplesKt.m90091to("SHN", "SH"), TuplesKt.m90091to("KNA", "KN"), TuplesKt.m90091to("LCA", "LC"), TuplesKt.m90091to("MAF", "MF"), TuplesKt.m90091to("SPM", "PM"), TuplesKt.m90091to("VCT", "VC"), TuplesKt.m90091to("WSM", "WS"), TuplesKt.m90091to("SMR", "SM"), TuplesKt.m90091to("STP", "ST"), TuplesKt.m90091to("SAU", "SA"), TuplesKt.m90091to("SEN", "SN"), TuplesKt.m90091to("SSD", "SS"), TuplesKt.m90091to("SRB", "RS"), TuplesKt.m90091to("SYC", "SC"), TuplesKt.m90091to("SLE", "SL"), TuplesKt.m90091to("SGP", "SG"), TuplesKt.m90091to("SXM", "SX"), TuplesKt.m90091to("SVK", "SK"), TuplesKt.m90091to("SVN", "SI"), TuplesKt.m90091to("SLB", "SB"), TuplesKt.m90091to("SOM", "SO"), TuplesKt.m90091to("ZAF", "ZA"), TuplesKt.m90091to("SGS", "GS"), TuplesKt.m90091to("ESP", "ES"), TuplesKt.m90091to("LKA", "LK"), TuplesKt.m90091to("SDN", "SD"), TuplesKt.m90091to("SUR", "SR"), TuplesKt.m90091to("SJM", "SJ"), TuplesKt.m90091to("SWZ", "SZ"), TuplesKt.m90091to("SWE", "SE"), TuplesKt.m90091to("CHE", "CH"), TuplesKt.m90091to("SYR", "SY"), TuplesKt.m90091to("TWN", "TW"), TuplesKt.m90091to("TJK", "TJ"), TuplesKt.m90091to("TZA", "TZ"), TuplesKt.m90091to("THA", "TH"), TuplesKt.m90091to("TLS", "TL"), TuplesKt.m90091to("TGO", "TG"), TuplesKt.m90091to("TKL", "TK"), TuplesKt.m90091to("TON", "TO"), TuplesKt.m90091to("TTO", "TT"), TuplesKt.m90091to("TUN", "TN"), TuplesKt.m90091to("TUR", "TR"), TuplesKt.m90091to("TKM", "TM"), TuplesKt.m90091to("TCA", "TC"), TuplesKt.m90091to("TUV", "TV"), TuplesKt.m90091to("UGA", "UG"), TuplesKt.m90091to("UKR", "UA"), TuplesKt.m90091to("ARE", "AE"), TuplesKt.m90091to("GBR", "GB"), TuplesKt.m90091to("USA", "US"), TuplesKt.m90091to("UMI", "UM"), TuplesKt.m90091to("URY", "UY"), TuplesKt.m90091to("UZB", "UZ"), TuplesKt.m90091to("VUT", "VU"), TuplesKt.m90091to("VEN", "VE"), TuplesKt.m90091to("VNM", "VN"), TuplesKt.m90091to("VGB", "VG"), TuplesKt.m90091to("VIR", "VI"), TuplesKt.m90091to("WLF", "WF"), TuplesKt.m90091to("ESH", "EH"), TuplesKt.m90091to("XKX", "XK"), TuplesKt.m90091to("YEM", "YE"), TuplesKt.m90091to("ZMB", "ZM"), TuplesKt.m90091to("ZWE", "ZW"));

    @JvmStatic
    @Nullable
    public static final String convertToAlpha2(@Nullable String alpha3Code) {
        if (alpha3Code == null) {
            return null;
        }
        Map map = f14750a;
        if (map.containsKey(alpha3Code)) {
            return (String) map.get(alpha3Code);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final String convertToAlpha3(@Nullable String alpha2Code) {
        if (alpha2Code == null) {
            return null;
        }
        Map map = f14750a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (Intrinsics.areEqual((String) entry.getValue(), alpha2Code)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (String) CollectionsKt.firstOrNull(linkedHashMap.keySet());
    }
}
