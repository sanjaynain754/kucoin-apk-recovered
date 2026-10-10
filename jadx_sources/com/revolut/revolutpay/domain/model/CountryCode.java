package com.revolut.revolutpay.domain.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.kubi.otc.entity.OtcAd;
import java.io.Serializable;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lcom/revolut/revolutpay/domain/model/CountryCode;", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class CountryCode implements Serializable {

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CountryCode f56065b = new CountryCode("AD");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CountryCode f56070c = new CountryCode("AE");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CountryCode f56075d = new CountryCode("AF");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CountryCode f56080e = new CountryCode("AI");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final CountryCode f56085f = new CountryCode("AL");

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final CountryCode f56090g = new CountryCode("AM");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final CountryCode f56095h = new CountryCode("AO");

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final CountryCode f56100i = new CountryCode("AR");

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final CountryCode f56105j = new CountryCode("AS");

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final CountryCode f56110k = new CountryCode("AT");

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final CountryCode f56115l = new CountryCode("AU");

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final CountryCode f56120m = new CountryCode("AW");

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final CountryCode f56125n = new CountryCode("AX");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final CountryCode f56130o = new CountryCode("BA");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final CountryCode f56135p = new CountryCode("BD");

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final CountryCode f56140q = new CountryCode("BE");

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final CountryCode f56145r = new CountryCode("BF");

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final CountryCode f56150s = new CountryCode("BG");

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final CountryCode f56155t = new CountryCode("BH");

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final CountryCode f56159u = new CountryCode("BI");

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final CountryCode f56163v = new CountryCode("BL");

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final CountryCode f56167w = new CountryCode("BM");

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final CountryCode f56171x = new CountryCode("BO");

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final CountryCode f56175y = new CountryCode("BQ");

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final CountryCode f56179z = new CountryCode("BR");

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final CountryCode f55964A = new CountryCode("BS");

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final CountryCode f55968B = new CountryCode("BT");

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final CountryCode f55972C = new CountryCode("BY");

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final CountryCode f55976D = new CountryCode("CA");

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final CountryCode f55980E = new CountryCode("CC");

    /* JADX INFO: renamed from: F */
    @NotNull
    public static final CountryCode f55984F = new CountryCode("CD");

    /* JADX INFO: renamed from: G */
    @NotNull
    public static final CountryCode f55988G = new CountryCode("CF");

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final CountryCode f55992H = new CountryCode("CG");

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final CountryCode f55995I = new CountryCode("CH");

    /* JADX INFO: renamed from: J */
    @NotNull
    public static final CountryCode f55998J = new CountryCode("CI");

    /* JADX INFO: renamed from: K */
    @NotNull
    public static final CountryCode f56001K = new CountryCode("CL");

    /* JADX INFO: renamed from: L */
    @NotNull
    public static final CountryCode f56005L = new CountryCode("CM");

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final CountryCode f56008M = new CountryCode("CN");

    /* JADX INFO: renamed from: N */
    @NotNull
    public static final CountryCode f56011N = new CountryCode("CO");

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final CountryCode f56014O = new CountryCode("CR");

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final CountryCode f56017P = new CountryCode("CU");

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static final CountryCode f56021Q = new CountryCode("CV");

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final CountryCode f56025R = new CountryCode("CW");

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final CountryCode f56029S = new CountryCode("CX");

    /* JADX INFO: renamed from: T */
    @NotNull
    public static final CountryCode f56033T = new CountryCode("CY");

    /* JADX INFO: renamed from: U */
    @NotNull
    public static final CountryCode f56037U = new CountryCode("CZ");

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final CountryCode f56041V = new CountryCode("DE");

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final CountryCode f56045W = new CountryCode("DJ");

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final CountryCode f56049X = new CountryCode("DK");

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final CountryCode f56053Y = new CountryCode("DM");

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final CountryCode f56057Z = new CountryCode("DO");

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final CountryCode f56061a0 = new CountryCode("DZ");

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final CountryCode f56066b0 = new CountryCode("EA");

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final CountryCode f56071c0 = new CountryCode("EC");

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final CountryCode f56076d0 = new CountryCode("EE");

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final CountryCode f56081e0 = new CountryCode("EG");

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final CountryCode f56086f0 = new CountryCode("ER");

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final CountryCode f56091g0 = new CountryCode("ES");

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final CountryCode f56096h0 = new CountryCode("ET");

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final CountryCode f56101i0 = new CountryCode("FI");

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final CountryCode f56106j0 = new CountryCode("FK");

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final CountryCode f56111k0 = new CountryCode("FM");

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final CountryCode f56116l0 = new CountryCode("FR");

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public static final CountryCode f56121m0 = new CountryCode("GA");

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public static final CountryCode f56126n0 = new CountryCode("GB");

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public static final CountryCode f56131o0 = new CountryCode("GE");

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public static final CountryCode f56136p0 = new CountryCode("GF");

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final CountryCode f56141q0 = new CountryCode("GG");

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final CountryCode f56146r0 = new CountryCode("GI");

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final CountryCode f56151s0 = new CountryCode("GL");

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final CountryCode f56156t0 = new CountryCode("GM");

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final CountryCode f56160u0 = new CountryCode("GN");

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final CountryCode f56164v0 = new CountryCode("GP");

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final CountryCode f56168w0 = new CountryCode("GR");

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final CountryCode f56172x0 = new CountryCode("GS");

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final CountryCode f56176y0 = new CountryCode("GT");

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final CountryCode f56180z0 = new CountryCode("GU");

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final CountryCode f55965A0 = new CountryCode("GW");

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final CountryCode f55969B0 = new CountryCode("GY");

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public static final CountryCode f55973C0 = new CountryCode("HK");

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public static final CountryCode f55977D0 = new CountryCode("HR");

    /* JADX INFO: renamed from: E0 */
    @NotNull
    public static final CountryCode f55981E0 = new CountryCode("HT");

    /* JADX INFO: renamed from: F0 */
    @NotNull
    public static final CountryCode f55985F0 = new CountryCode("HU");

    /* JADX INFO: renamed from: G0 */
    @NotNull
    public static final CountryCode f55989G0 = new CountryCode("IC");

    /* JADX INFO: renamed from: K0 */
    @NotNull
    public static final CountryCode f56002K0 = new CountryCode("ID");

    /* JADX INFO: renamed from: P0 */
    @NotNull
    public static final CountryCode f56018P0 = new CountryCode("IE");

    /* JADX INFO: renamed from: Q0 */
    @NotNull
    public static final CountryCode f56022Q0 = new CountryCode("IL");

    /* JADX INFO: renamed from: R0 */
    @NotNull
    public static final CountryCode f56026R0 = new CountryCode("IM");

    /* JADX INFO: renamed from: S0 */
    @NotNull
    public static final CountryCode f56030S0 = new CountryCode("IN");

    /* JADX INFO: renamed from: T0 */
    @NotNull
    public static final CountryCode f56034T0 = new CountryCode("IO");

    /* JADX INFO: renamed from: U0 */
    @NotNull
    public static final CountryCode f56038U0 = new CountryCode("IQ");

    /* JADX INFO: renamed from: V0 */
    @NotNull
    public static final CountryCode f56042V0 = new CountryCode("IR");

    /* JADX INFO: renamed from: W0 */
    @NotNull
    public static final CountryCode f56046W0 = new CountryCode("IS");

    /* JADX INFO: renamed from: X0 */
    @NotNull
    public static final CountryCode f56050X0 = new CountryCode("IT");

    /* JADX INFO: renamed from: Y0 */
    @NotNull
    public static final CountryCode f56054Y0 = new CountryCode("JE");

    /* JADX INFO: renamed from: Z0 */
    @NotNull
    public static final CountryCode f56058Z0 = new CountryCode("JM");

    /* JADX INFO: renamed from: a1 */
    @NotNull
    public static final CountryCode f56062a1 = new CountryCode("JO");

    /* JADX INFO: renamed from: b1 */
    @NotNull
    public static final CountryCode f56067b1 = new CountryCode("JP");

    /* JADX INFO: renamed from: c1 */
    @NotNull
    public static final CountryCode f56072c1 = new CountryCode("KE");

    /* JADX INFO: renamed from: d1 */
    @NotNull
    public static final CountryCode f56077d1 = new CountryCode(ExpandedProductParsedResult.KILOGRAM);

    /* JADX INFO: renamed from: e1 */
    @NotNull
    public static final CountryCode f56082e1 = new CountryCode("KH");

    /* JADX INFO: renamed from: f1 */
    @NotNull
    public static final CountryCode f56087f1 = new CountryCode("KI");

    /* JADX INFO: renamed from: g1 */
    @NotNull
    public static final CountryCode f56092g1 = new CountryCode("KP");

    /* JADX INFO: renamed from: h1 */
    @NotNull
    public static final CountryCode f56097h1 = new CountryCode("KR");

    /* JADX INFO: renamed from: i1 */
    @NotNull
    public static final CountryCode f56102i1 = new CountryCode("KW");

    /* JADX INFO: renamed from: j1 */
    @NotNull
    public static final CountryCode f56107j1 = new CountryCode("KY");

    /* JADX INFO: renamed from: k1 */
    @NotNull
    public static final CountryCode f56112k1 = new CountryCode("KZ");

    /* JADX INFO: renamed from: l1 */
    @NotNull
    public static final CountryCode f56117l1 = new CountryCode("LA");

    /* JADX INFO: renamed from: m1 */
    @NotNull
    public static final CountryCode f56122m1 = new CountryCode(ExpandedProductParsedResult.POUND);

    /* JADX INFO: renamed from: n1 */
    @NotNull
    public static final CountryCode f56127n1 = new CountryCode("LI");

    /* JADX INFO: renamed from: o1 */
    @NotNull
    public static final CountryCode f56132o1 = new CountryCode("LK");

    /* JADX INFO: renamed from: p1 */
    @NotNull
    public static final CountryCode f56137p1 = new CountryCode("LR");

    /* JADX INFO: renamed from: q1 */
    @NotNull
    public static final CountryCode f56142q1 = new CountryCode("LS");

    /* JADX INFO: renamed from: r1 */
    @NotNull
    public static final CountryCode f56147r1 = new CountryCode("LT");

    /* JADX INFO: renamed from: s1 */
    @NotNull
    public static final CountryCode f56152s1 = new CountryCode("LU");

    /* JADX INFO: renamed from: t1 */
    @NotNull
    public static final CountryCode f56157t1 = new CountryCode("LV");

    /* JADX INFO: renamed from: u1 */
    @NotNull
    public static final CountryCode f56161u1 = new CountryCode("LY");

    /* JADX INFO: renamed from: v1 */
    @NotNull
    public static final CountryCode f56165v1 = new CountryCode("MA");

    /* JADX INFO: renamed from: w1 */
    @NotNull
    public static final CountryCode f56169w1 = new CountryCode("MC");

    /* JADX INFO: renamed from: x1 */
    @NotNull
    public static final CountryCode f56173x1 = new CountryCode("ME");

    /* JADX INFO: renamed from: y1 */
    @NotNull
    public static final CountryCode f56177y1 = new CountryCode("MF");

    /* JADX INFO: renamed from: z1 */
    @NotNull
    public static final CountryCode f56181z1 = new CountryCode("MG");

    /* JADX INFO: renamed from: A1 */
    @NotNull
    public static final CountryCode f55966A1 = new CountryCode("MH");

    /* JADX INFO: renamed from: B1 */
    @NotNull
    public static final CountryCode f55970B1 = new CountryCode("MK");

    /* JADX INFO: renamed from: C1 */
    @NotNull
    public static final CountryCode f55974C1 = new CountryCode("MM");

    /* JADX INFO: renamed from: D1 */
    @NotNull
    public static final CountryCode f55978D1 = new CountryCode("MN");

    /* JADX INFO: renamed from: E1 */
    @NotNull
    public static final CountryCode f55982E1 = new CountryCode("MO");

    /* JADX INFO: renamed from: F1 */
    @NotNull
    public static final CountryCode f55986F1 = new CountryCode("MP");

    /* JADX INFO: renamed from: G1 */
    @NotNull
    public static final CountryCode f55990G1 = new CountryCode("MQ");

    /* JADX INFO: renamed from: H1 */
    @NotNull
    public static final CountryCode f55993H1 = new CountryCode("MS");

    /* JADX INFO: renamed from: I1 */
    @NotNull
    public static final CountryCode f55996I1 = new CountryCode("MT");

    /* JADX INFO: renamed from: J1 */
    @NotNull
    public static final CountryCode f55999J1 = new CountryCode("MU");

    /* JADX INFO: renamed from: K1 */
    @NotNull
    public static final CountryCode f56003K1 = new CountryCode("MV");

    /* JADX INFO: renamed from: L1 */
    @NotNull
    public static final CountryCode f56006L1 = new CountryCode("MX");

    /* JADX INFO: renamed from: M1 */
    @NotNull
    public static final CountryCode f56009M1 = new CountryCode("MY");

    /* JADX INFO: renamed from: N1 */
    @NotNull
    public static final CountryCode f56012N1 = new CountryCode("MZ");

    /* JADX INFO: renamed from: O1 */
    @NotNull
    public static final CountryCode f56015O1 = new CountryCode("NA");

    /* JADX INFO: renamed from: P1 */
    @NotNull
    public static final CountryCode f56019P1 = new CountryCode("NC");

    /* JADX INFO: renamed from: Q1 */
    @NotNull
    public static final CountryCode f56023Q1 = new CountryCode("NE");

    /* JADX INFO: renamed from: R1 */
    @NotNull
    public static final CountryCode f56027R1 = new CountryCode("NF");

    /* JADX INFO: renamed from: S1 */
    @NotNull
    public static final CountryCode f56031S1 = new CountryCode("NG");

    /* JADX INFO: renamed from: T1 */
    @NotNull
    public static final CountryCode f56035T1 = new CountryCode("NI");

    /* JADX INFO: renamed from: U1 */
    @NotNull
    public static final CountryCode f56039U1 = new CountryCode("NL");

    /* JADX INFO: renamed from: V1 */
    @NotNull
    public static final CountryCode f56043V1 = new CountryCode(OtcAd.KYC_NO);

    /* JADX INFO: renamed from: W1 */
    @NotNull
    public static final CountryCode f56047W1 = new CountryCode("NP");

    /* JADX INFO: renamed from: X1 */
    @NotNull
    public static final CountryCode f56051X1 = new CountryCode("NR");

    /* JADX INFO: renamed from: Y1 */
    @NotNull
    public static final CountryCode f56055Y1 = new CountryCode("NZ");

    /* JADX INFO: renamed from: Z1 */
    @NotNull
    public static final CountryCode f56059Z1 = new CountryCode("OM");

    /* JADX INFO: renamed from: a2 */
    @NotNull
    public static final CountryCode f56063a2 = new CountryCode("PA");

    /* JADX INFO: renamed from: b2 */
    @NotNull
    public static final CountryCode f56068b2 = new CountryCode("PE");

    /* JADX INFO: renamed from: c2 */
    @NotNull
    public static final CountryCode f56073c2 = new CountryCode("PF");

    /* JADX INFO: renamed from: d2 */
    @NotNull
    public static final CountryCode f56078d2 = new CountryCode("PG");

    /* JADX INFO: renamed from: e2 */
    @NotNull
    public static final CountryCode f56083e2 = new CountryCode("PH");

    /* JADX INFO: renamed from: f2 */
    @NotNull
    public static final CountryCode f56088f2 = new CountryCode("PK");

    /* JADX INFO: renamed from: g2 */
    @NotNull
    public static final CountryCode f56093g2 = new CountryCode("PL");

    /* JADX INFO: renamed from: h2 */
    @NotNull
    public static final CountryCode f56098h2 = new CountryCode("PM");

    /* JADX INFO: renamed from: i2 */
    @NotNull
    public static final CountryCode f56103i2 = new CountryCode("PN");

    /* JADX INFO: renamed from: j2 */
    @NotNull
    public static final CountryCode f56108j2 = new CountryCode("PR");

    /* JADX INFO: renamed from: k2 */
    @NotNull
    public static final CountryCode f56113k2 = new CountryCode("PS");

    /* JADX INFO: renamed from: l2 */
    @NotNull
    public static final CountryCode f56118l2 = new CountryCode("PT");

    /* JADX INFO: renamed from: m2 */
    @NotNull
    public static final CountryCode f56123m2 = new CountryCode("PW");

    /* JADX INFO: renamed from: n2 */
    @NotNull
    public static final CountryCode f56128n2 = new CountryCode("PY");

    /* JADX INFO: renamed from: o2 */
    @NotNull
    public static final CountryCode f56133o2 = new CountryCode("RE");

    /* JADX INFO: renamed from: p2 */
    @NotNull
    public static final CountryCode f56138p2 = new CountryCode("RO");

    /* JADX INFO: renamed from: q2 */
    @NotNull
    public static final CountryCode f56143q2 = new CountryCode("RS");

    /* JADX INFO: renamed from: r2 */
    @NotNull
    public static final CountryCode f56148r2 = new CountryCode("RU");

    /* JADX INFO: renamed from: s2 */
    @NotNull
    public static final CountryCode f56153s2 = new CountryCode("SA");

    /* JADX INFO: renamed from: t2 */
    @NotNull
    public static final CountryCode f56158t2 = new CountryCode("SD");

    /* JADX INFO: renamed from: u2 */
    @NotNull
    public static final CountryCode f56162u2 = new CountryCode("SE");

    /* JADX INFO: renamed from: v2 */
    @NotNull
    public static final CountryCode f56166v2 = new CountryCode("SG");

    /* JADX INFO: renamed from: w2 */
    @NotNull
    public static final CountryCode f56170w2 = new CountryCode("SH");

    /* JADX INFO: renamed from: x2 */
    @NotNull
    public static final CountryCode f56174x2 = new CountryCode("SI");

    /* JADX INFO: renamed from: y2 */
    @NotNull
    public static final CountryCode f56178y2 = new CountryCode("SJ");

    /* JADX INFO: renamed from: z2 */
    @NotNull
    public static final CountryCode f56182z2 = new CountryCode("SK");

    /* JADX INFO: renamed from: A2 */
    @NotNull
    public static final CountryCode f55967A2 = new CountryCode("SL");

    /* JADX INFO: renamed from: B2 */
    @NotNull
    public static final CountryCode f55971B2 = new CountryCode("SM");

    /* JADX INFO: renamed from: C2 */
    @NotNull
    public static final CountryCode f55975C2 = new CountryCode("SN");

    /* JADX INFO: renamed from: D2 */
    @NotNull
    public static final CountryCode f55979D2 = new CountryCode("SO");

    /* JADX INFO: renamed from: E2 */
    @NotNull
    public static final CountryCode f55983E2 = new CountryCode("SR");

    /* JADX INFO: renamed from: F2 */
    @NotNull
    public static final CountryCode f55987F2 = new CountryCode("SS");

    /* JADX INFO: renamed from: G2 */
    @NotNull
    public static final CountryCode f55991G2 = new CountryCode("SV");

    /* JADX INFO: renamed from: H2 */
    @NotNull
    public static final CountryCode f55994H2 = new CountryCode("SX");

    /* JADX INFO: renamed from: I2 */
    @NotNull
    public static final CountryCode f55997I2 = new CountryCode("SY");

    /* JADX INFO: renamed from: J2 */
    @NotNull
    public static final CountryCode f56000J2 = new CountryCode("SZ");

    /* JADX INFO: renamed from: K2 */
    @NotNull
    public static final CountryCode f56004K2 = new CountryCode("TC");

    /* JADX INFO: renamed from: L2 */
    @NotNull
    public static final CountryCode f56007L2 = new CountryCode("TD");

    /* JADX INFO: renamed from: M2 */
    @NotNull
    public static final CountryCode f56010M2 = new CountryCode("TF");

    /* JADX INFO: renamed from: N2 */
    @NotNull
    public static final CountryCode f56013N2 = new CountryCode("TG");

    /* JADX INFO: renamed from: O2 */
    @NotNull
    public static final CountryCode f56016O2 = new CountryCode("TH");

    /* JADX INFO: renamed from: P2 */
    @NotNull
    public static final CountryCode f56020P2 = new CountryCode("TJ");

    /* JADX INFO: renamed from: Q2 */
    @NotNull
    public static final CountryCode f56024Q2 = new CountryCode("TL");

    /* JADX INFO: renamed from: R2 */
    @NotNull
    public static final CountryCode f56028R2 = new CountryCode("TM");

    /* JADX INFO: renamed from: S2 */
    @NotNull
    public static final CountryCode f56032S2 = new CountryCode("TN");

    /* JADX INFO: renamed from: T2 */
    @NotNull
    public static final CountryCode f56036T2 = new CountryCode("TO");

    /* JADX INFO: renamed from: U2 */
    @NotNull
    public static final CountryCode f56040U2 = new CountryCode("TR");

    /* JADX INFO: renamed from: V2 */
    @NotNull
    public static final CountryCode f56044V2 = new CountryCode("TT");

    /* JADX INFO: renamed from: W2 */
    @NotNull
    public static final CountryCode f56048W2 = new CountryCode("TV");

    /* JADX INFO: renamed from: X2 */
    @NotNull
    public static final CountryCode f56052X2 = new CountryCode("TW");

    /* JADX INFO: renamed from: Y2 */
    @NotNull
    public static final CountryCode f56056Y2 = new CountryCode("TZ");

    /* JADX INFO: renamed from: Z2 */
    @NotNull
    public static final CountryCode f56060Z2 = new CountryCode("UA");

    /* JADX INFO: renamed from: a3 */
    @NotNull
    public static final CountryCode f56064a3 = new CountryCode("UG");

    /* JADX INFO: renamed from: b3 */
    @NotNull
    public static final CountryCode f56069b3 = new CountryCode("UM");

    /* JADX INFO: renamed from: c3 */
    @NotNull
    public static final CountryCode f56074c3 = new CountryCode("US");

    /* JADX INFO: renamed from: d3 */
    @NotNull
    public static final CountryCode f56079d3 = new CountryCode("UY");

    /* JADX INFO: renamed from: e3 */
    @NotNull
    public static final CountryCode f56084e3 = new CountryCode("UZ");

    /* JADX INFO: renamed from: f3 */
    @NotNull
    public static final CountryCode f56089f3 = new CountryCode("VA");

    /* JADX INFO: renamed from: g3 */
    @NotNull
    public static final CountryCode f56094g3 = new CountryCode("VE");

    /* JADX INFO: renamed from: h3 */
    @NotNull
    public static final CountryCode f56099h3 = new CountryCode("VG");

    /* JADX INFO: renamed from: i3 */
    @NotNull
    public static final CountryCode f56104i3 = new CountryCode("VI");

    /* JADX INFO: renamed from: j3 */
    @NotNull
    public static final CountryCode f56109j3 = new CountryCode("VN");

    /* JADX INFO: renamed from: k3 */
    @NotNull
    public static final CountryCode f56114k3 = new CountryCode("VU");

    /* JADX INFO: renamed from: l3 */
    @NotNull
    public static final CountryCode f56119l3 = new CountryCode("WF");

    /* JADX INFO: renamed from: m3 */
    @NotNull
    public static final CountryCode f56124m3 = new CountryCode("WS");

    /* JADX INFO: renamed from: n3 */
    @NotNull
    public static final CountryCode f56129n3 = new CountryCode("XK");

    /* JADX INFO: renamed from: o3 */
    @NotNull
    public static final CountryCode f56134o3 = new CountryCode("YE");

    /* JADX INFO: renamed from: p3 */
    @NotNull
    public static final CountryCode f56139p3 = new CountryCode("YT");

    /* JADX INFO: renamed from: q3 */
    @NotNull
    public static final CountryCode f56144q3 = new CountryCode("ZA");

    /* JADX INFO: renamed from: r3 */
    @NotNull
    public static final CountryCode f56149r3 = new CountryCode("ZM");

    /* JADX INFO: renamed from: s3 */
    @NotNull
    public static final CountryCode f56154s3 = new CountryCode("ZW");

    @Metadata(m90083d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¸\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010»\u0003\u001a\u00020\u00042\b\u0010¼\u0003\u001a\u00030½\u0003R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0011\u0010?\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u0011\u0010A\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0006R\u0011\u0010C\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u0011\u0010E\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0006R\u0011\u0010G\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0006R\u0011\u0010I\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0006R\u0011\u0010K\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0006R\u0011\u0010M\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0006R\u0011\u0010O\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0006R\u0011\u0010Q\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0006R\u0011\u0010S\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0006R\u0011\u0010U\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0006R\u0011\u0010W\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0006R\u0011\u0010Y\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0006R\u0011\u0010[\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0006R\u0011\u0010]\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0006R\u0011\u0010_\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0006R\u0011\u0010a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0006R\u0011\u0010c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\u0006R\u0011\u0010e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\u0006R\u0011\u0010g\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0006R\u0011\u0010i\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0006R\u0011\u0010k\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0006R\u0011\u0010m\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\u0006R\u0011\u0010o\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0006R\u0011\u0010q\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\u0006R\u0011\u0010s\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\u0006R\u0011\u0010u\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\u0006R\u0011\u0010w\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\u0006R\u0011\u0010y\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\u0006R\u0011\u0010{\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\u0006R\u0011\u0010}\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u0006R\u0012\u0010\u007f\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0006R\u0013\u0010\u0081\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006R\u0013\u0010\u0083\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u0006R\u0013\u0010\u0085\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0006R\u0013\u0010\u0087\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006R\u0013\u0010\u0089\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0006R\u0013\u0010\u008b\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0006R\u0013\u0010\u008d\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006R\u0013\u0010\u008f\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u0006R\u0013\u0010\u0091\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0006R\u0013\u0010\u0093\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006R\u0013\u0010\u0095\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0006R\u0013\u0010\u0097\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u0006R\u0013\u0010\u0099\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006R\u0013\u0010\u009b\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u0006R\u0013\u0010\u009d\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0006R\u0013\u0010\u009f\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010\u0006R\u0013\u0010¡\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010\u0006R\u0013\u0010£\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010\u0006R\u0013\u0010¥\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\u0006R\u0013\u0010§\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010\u0006R\u0013\u0010©\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010\u0006R\u0013\u0010«\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010\u0006R\u0013\u0010\u00ad\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010\u0006R\u0013\u0010¯\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010\u0006R\u0013\u0010±\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010\u0006R\u0013\u0010³\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010\u0006R\u0013\u0010µ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010\u0006R\u0013\u0010·\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010\u0006R\u0013\u0010¹\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010\u0006R\u0013\u0010»\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010\u0006R\u0013\u0010½\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010\u0006R\u0013\u0010¿\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010\u0006R\u0013\u0010Á\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010\u0006R\u0013\u0010Ã\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010\u0006R\u0013\u0010Å\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010\u0006R\u0013\u0010Ç\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010\u0006R\u0013\u0010É\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010\u0006R\u0013\u0010Ë\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010\u0006R\u0013\u0010Í\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010\u0006R\u0013\u0010Ï\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\u0006R\u0013\u0010Ñ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010\u0006R\u0013\u0010Ó\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010\u0006R\u0013\u0010Õ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0001\u0010\u0006R\u0013\u0010×\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010\u0006R\u0013\u0010Ù\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0001\u0010\u0006R\u0013\u0010Û\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010\u0006R\u0013\u0010Ý\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010\u0006R\u0013\u0010ß\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010\u0006R\u0013\u0010á\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010\u0006R\u0013\u0010ã\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010\u0006R\u0013\u0010å\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0001\u0010\u0006R\u0013\u0010ç\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010\u0006R\u0013\u0010é\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010\u0006R\u0013\u0010ë\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010\u0006R\u0013\u0010í\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010\u0006R\u0013\u0010ï\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0001\u0010\u0006R\u0013\u0010ñ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0001\u0010\u0006R\u0013\u0010ó\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0001\u0010\u0006R\u0013\u0010õ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010\u0006R\u0013\u0010÷\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0001\u0010\u0006R\u0013\u0010ù\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0001\u0010\u0006R\u0013\u0010û\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0001\u0010\u0006R\u0013\u0010ý\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0001\u0010\u0006R\u0013\u0010ÿ\u0001\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0002\u0010\u0006R\u0013\u0010\u0081\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0002\u0010\u0006R\u0013\u0010\u0083\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0002\u0010\u0006R\u0013\u0010\u0085\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0002\u0010\u0006R\u0013\u0010\u0087\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0002\u0010\u0006R\u0013\u0010\u0089\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0002\u0010\u0006R\u0013\u0010\u008b\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0002\u0010\u0006R\u0013\u0010\u008d\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0002\u0010\u0006R\u0013\u0010\u008f\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0002\u0010\u0006R\u0013\u0010\u0091\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0002\u0010\u0006R\u0013\u0010\u0093\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0002\u0010\u0006R\u0013\u0010\u0095\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0002\u0010\u0006R\u0013\u0010\u0097\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0002\u0010\u0006R\u0013\u0010\u0099\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0002\u0010\u0006R\u0013\u0010\u009b\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0002\u0010\u0006R\u0013\u0010\u009d\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0002\u0010\u0006R\u0013\u0010\u009f\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0002\u0010\u0006R\u0013\u0010¡\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0002\u0010\u0006R\u0013\u0010£\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0002\u0010\u0006R\u0013\u0010¥\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0002\u0010\u0006R\u0013\u0010§\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0002\u0010\u0006R\u0013\u0010©\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0002\u0010\u0006R\u0013\u0010«\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0002\u0010\u0006R\u0013\u0010\u00ad\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0002\u0010\u0006R\u0013\u0010¯\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0002\u0010\u0006R\u0013\u0010±\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0002\u0010\u0006R\u0013\u0010³\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0002\u0010\u0006R\u0013\u0010µ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0002\u0010\u0006R\u0013\u0010·\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0002\u0010\u0006R\u0013\u0010¹\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0002\u0010\u0006R\u0013\u0010»\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0002\u0010\u0006R\u0013\u0010½\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0002\u0010\u0006R\u0013\u0010¿\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0002\u0010\u0006R\u0013\u0010Á\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0002\u0010\u0006R\u0013\u0010Ã\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0002\u0010\u0006R\u0013\u0010Å\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0002\u0010\u0006R\u0013\u0010Ç\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0002\u0010\u0006R\u0013\u0010É\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0002\u0010\u0006R\u0013\u0010Ë\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0002\u0010\u0006R\u0013\u0010Í\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0002\u0010\u0006R\u0013\u0010Ï\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0002\u0010\u0006R\u0013\u0010Ñ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0002\u0010\u0006R\u0013\u0010Ó\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0002\u0010\u0006R\u0013\u0010Õ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0002\u0010\u0006R\u0013\u0010×\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0002\u0010\u0006R\u0013\u0010Ù\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0002\u0010\u0006R\u0013\u0010Û\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0002\u0010\u0006R\u0013\u0010Ý\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0002\u0010\u0006R\u0013\u0010ß\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0002\u0010\u0006R\u0013\u0010á\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0002\u0010\u0006R\u0013\u0010ã\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0002\u0010\u0006R\u0013\u0010å\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0002\u0010\u0006R\u0013\u0010ç\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0002\u0010\u0006R\u0013\u0010é\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0002\u0010\u0006R\u0013\u0010ë\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0002\u0010\u0006R\u0013\u0010í\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0002\u0010\u0006R\u0013\u0010ï\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0002\u0010\u0006R\u0013\u0010ñ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0002\u0010\u0006R\u0013\u0010ó\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0002\u0010\u0006R\u0013\u0010õ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0002\u0010\u0006R\u0013\u0010÷\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0002\u0010\u0006R\u0013\u0010ù\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0002\u0010\u0006R\u0013\u0010û\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0002\u0010\u0006R\u0013\u0010ý\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0002\u0010\u0006R\u0013\u0010ÿ\u0002\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0003\u0010\u0006R\u0013\u0010\u0081\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0003\u0010\u0006R\u0013\u0010\u0083\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0003\u0010\u0006R\u0013\u0010\u0085\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0003\u0010\u0006R\u0013\u0010\u0087\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0003\u0010\u0006R\u0013\u0010\u0089\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0003\u0010\u0006R\u0013\u0010\u008b\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0003\u0010\u0006R\u0013\u0010\u008d\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0003\u0010\u0006R\u0013\u0010\u008f\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0003\u0010\u0006R\u0013\u0010\u0091\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0003\u0010\u0006R\u0013\u0010\u0093\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0003\u0010\u0006R\u0013\u0010\u0095\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0003\u0010\u0006R\u0013\u0010\u0097\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0003\u0010\u0006R\u0013\u0010\u0099\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0003\u0010\u0006R\u0013\u0010\u009b\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0003\u0010\u0006R\u0013\u0010\u009d\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0003\u0010\u0006R\u0013\u0010\u009f\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0003\u0010\u0006R\u0013\u0010¡\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0003\u0010\u0006R\u0013\u0010£\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0003\u0010\u0006R\u0013\u0010¥\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0003\u0010\u0006R\u0013\u0010§\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0003\u0010\u0006R\u0013\u0010©\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0003\u0010\u0006R\u0013\u0010«\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0003\u0010\u0006R\u0013\u0010\u00ad\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0003\u0010\u0006R\u0013\u0010¯\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0003\u0010\u0006R\u0013\u0010±\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0003\u0010\u0006R\u0013\u0010³\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0003\u0010\u0006R\u0013\u0010µ\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0003\u0010\u0006R\u0013\u0010·\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0003\u0010\u0006R\u0013\u0010¹\u0003\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0003\u0010\u0006¨\u0006¾\u0003"}, m90084d2 = {"Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;", "", "()V", "AD", "Lcom/revolut/revolutpay/domain/model/CountryCode;", "getAD", "()Lcom/revolut/revolutpay/domain/model/CountryCode;", "AE", "getAE", "AF", "getAF", "AI", "getAI", "AL", "getAL", "AM", "getAM", "AO", "getAO", "AR", "getAR", "AS", "getAS", "AT", "getAT", "AU", "getAU", "AW", "getAW", "AX", "getAX", "BA", "getBA", "BD", "getBD", "BE", "getBE", "BF", "getBF", "BG", "getBG", "BH", "getBH", "BI", "getBI", "BL", "getBL", "BM", "getBM", "BO", "getBO", "BQ", "getBQ", "BR", "getBR", "BS", "getBS", "BT", "getBT", "BY", "getBY", "CA", "getCA", "CC", "getCC", "CD", "getCD", "CF", "getCF", "CG", "getCG", "CH", "getCH", "CI", "getCI", "CL", "getCL", "CM", "getCM", "CN", "getCN", "CO", "getCO", "CR", "getCR", "CU", "getCU", "CV", "getCV", "CW", "getCW", "CX", "getCX", "CY", "getCY", "CZ", "getCZ", "DE", "getDE", "DJ", "getDJ", "DK", "getDK", "DM", "getDM", "DO", "getDO", "DZ", "getDZ", "EA", "getEA", "EC", "getEC", "EE", "getEE", "EG", "getEG", "ER", "getER", "ES", "getES", "ET", "getET", "FI", "getFI", "FK", "getFK", "FM", "getFM", "FR", "getFR", "GA", "getGA", "GB", "getGB", "GE", "getGE", "GF", "getGF", "GG", "getGG", "GI", "getGI", "GL", "getGL", "GM", "getGM", "GN", "getGN", "GP", "getGP", "GR", "getGR", "GS", "getGS", "GT", "getGT", "GU", "getGU", "GW", "getGW", "GY", "getGY", "HK", "getHK", "HR", "getHR", "HT", "getHT", "HU", "getHU", "IC", "getIC", "ID", "getID", "IE", "getIE", "IL", "getIL", "IM", "getIM", "IN", "getIN", "IO", "getIO", "IQ", "getIQ", "IR", "getIR", "IS", "getIS", "IT", "getIT", "JE", "getJE", "JM", "getJM", "JO", "getJO", "JP", "getJP", "KE", "getKE", ExpandedProductParsedResult.KILOGRAM, "getKG", "KH", "getKH", "KI", "getKI", "KP", "getKP", "KR", "getKR", "KW", "getKW", "KY", "getKY", "KZ", "getKZ", "LA", "getLA", ExpandedProductParsedResult.POUND, "getLB", "LI", "getLI", "LK", "getLK", "LR", "getLR", "LS", "getLS", "LT", "getLT", "LU", "getLU", "LV", "getLV", "LY", "getLY", "MA", "getMA", "MC", "getMC", "ME", "getME", "MF", "getMF", "MG", "getMG", "MH", "getMH", "MK", "getMK", "MM", "getMM", "MN", "getMN", "MO", "getMO", "MP", "getMP", "MQ", "getMQ", "MS", "getMS", "MT", "getMT", "MU", "getMU", "MV", "getMV", "MX", "getMX", "MY", "getMY", "MZ", "getMZ", "NA", "getNA", "NC", "getNC", "NE", "getNE", "NF", "getNF", "NG", "getNG", "NI", "getNI", "NL", "getNL", OtcAd.KYC_NO, "getNO", "NP", "getNP", "NR", "getNR", "NZ", "getNZ", "OM", "getOM", "PA", "getPA", "PE", "getPE", "PF", "getPF", "PG", "getPG", "PH", "getPH", "PK", "getPK", "PL", "getPL", "PM", "getPM", "PN", "getPN", "PR", "getPR", "PS", "getPS", "PT", "getPT", "PW", "getPW", "PY", "getPY", "RE", "getRE", "RO", "getRO", "RS", "getRS", "RU", "getRU", "SA", "getSA", "SD", "getSD", "SE", "getSE", "SG", "getSG", "SH", "getSH", "SI", "getSI", "SJ", "getSJ", "SK", "getSK", "SL", "getSL", "SM", "getSM", "SN", "getSN", "SO", "getSO", "SR", "getSR", "SS", "getSS", "SV", "getSV", "SX", "getSX", "SY", "getSY", "SZ", "getSZ", "TC", "getTC", "TD", "getTD", "TF", "getTF", "TG", "getTG", "TH", "getTH", "TJ", "getTJ", "TL", "getTL", "TM", "getTM", "TN", "getTN", "TO", "getTO", "TR", "getTR", "TT", "getTT", "TV", "getTV", "TW", "getTW", "TZ", "getTZ", "UA", "getUA", "UG", "getUG", "UM", "getUM", "US", "getUS", "UY", "getUY", "UZ", "getUZ", "VA", "getVA", "VE", "getVE", "VG", "getVG", "VI", "getVI", "VN", "getVN", "VU", "getVU", "WF", "getWF", "WS", "getWS", "XK", "getXK", "YE", "getYE", "YT", "getYT", "ZA", "getZA", "ZM", "getZM", "ZW", "getZW", "fromValue", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CountryCode fromValue(@NotNull String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = countryCode.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return new CountryCode(upperCase, null);
        }

        @NotNull
        public final CountryCode getAD() {
            return CountryCode.f56065b;
        }

        @NotNull
        public final CountryCode getAE() {
            return CountryCode.f56070c;
        }

        @NotNull
        public final CountryCode getAF() {
            return CountryCode.f56075d;
        }

        @NotNull
        public final CountryCode getAI() {
            return CountryCode.f56080e;
        }

        @NotNull
        public final CountryCode getAL() {
            return CountryCode.f56085f;
        }

        @NotNull
        public final CountryCode getAM() {
            return CountryCode.f56090g;
        }

        @NotNull
        public final CountryCode getAO() {
            return CountryCode.f56095h;
        }

        @NotNull
        public final CountryCode getAR() {
            return CountryCode.f56100i;
        }

        @NotNull
        public final CountryCode getAS() {
            return CountryCode.f56105j;
        }

        @NotNull
        public final CountryCode getAT() {
            return CountryCode.f56110k;
        }

        @NotNull
        public final CountryCode getAU() {
            return CountryCode.f56115l;
        }

        @NotNull
        public final CountryCode getAW() {
            return CountryCode.f56120m;
        }

        @NotNull
        public final CountryCode getAX() {
            return CountryCode.f56125n;
        }

        @NotNull
        public final CountryCode getBA() {
            return CountryCode.f56130o;
        }

        @NotNull
        public final CountryCode getBD() {
            return CountryCode.f56135p;
        }

        @NotNull
        public final CountryCode getBE() {
            return CountryCode.f56140q;
        }

        @NotNull
        public final CountryCode getBF() {
            return CountryCode.f56145r;
        }

        @NotNull
        public final CountryCode getBG() {
            return CountryCode.f56150s;
        }

        @NotNull
        public final CountryCode getBH() {
            return CountryCode.f56155t;
        }

        @NotNull
        public final CountryCode getBI() {
            return CountryCode.f56159u;
        }

        @NotNull
        public final CountryCode getBL() {
            return CountryCode.f56163v;
        }

        @NotNull
        public final CountryCode getBM() {
            return CountryCode.f56167w;
        }

        @NotNull
        public final CountryCode getBO() {
            return CountryCode.f56171x;
        }

        @NotNull
        public final CountryCode getBQ() {
            return CountryCode.f56175y;
        }

        @NotNull
        public final CountryCode getBR() {
            return CountryCode.f56179z;
        }

        @NotNull
        public final CountryCode getBS() {
            return CountryCode.f55964A;
        }

        @NotNull
        public final CountryCode getBT() {
            return CountryCode.f55968B;
        }

        @NotNull
        public final CountryCode getBY() {
            return CountryCode.f55972C;
        }

        @NotNull
        public final CountryCode getCA() {
            return CountryCode.f55976D;
        }

        @NotNull
        public final CountryCode getCC() {
            return CountryCode.f55980E;
        }

        @NotNull
        public final CountryCode getCD() {
            return CountryCode.f55984F;
        }

        @NotNull
        public final CountryCode getCF() {
            return CountryCode.f55988G;
        }

        @NotNull
        public final CountryCode getCG() {
            return CountryCode.f55992H;
        }

        @NotNull
        public final CountryCode getCH() {
            return CountryCode.f55995I;
        }

        @NotNull
        public final CountryCode getCI() {
            return CountryCode.f55998J;
        }

        @NotNull
        public final CountryCode getCL() {
            return CountryCode.f56001K;
        }

        @NotNull
        public final CountryCode getCM() {
            return CountryCode.f56005L;
        }

        @NotNull
        public final CountryCode getCN() {
            return CountryCode.f56008M;
        }

        @NotNull
        public final CountryCode getCO() {
            return CountryCode.f56011N;
        }

        @NotNull
        public final CountryCode getCR() {
            return CountryCode.f56014O;
        }

        @NotNull
        public final CountryCode getCU() {
            return CountryCode.f56017P;
        }

        @NotNull
        public final CountryCode getCV() {
            return CountryCode.f56021Q;
        }

        @NotNull
        public final CountryCode getCW() {
            return CountryCode.f56025R;
        }

        @NotNull
        public final CountryCode getCX() {
            return CountryCode.f56029S;
        }

        @NotNull
        public final CountryCode getCY() {
            return CountryCode.f56033T;
        }

        @NotNull
        public final CountryCode getCZ() {
            return CountryCode.f56037U;
        }

        @NotNull
        public final CountryCode getDE() {
            return CountryCode.f56041V;
        }

        @NotNull
        public final CountryCode getDJ() {
            return CountryCode.f56045W;
        }

        @NotNull
        public final CountryCode getDK() {
            return CountryCode.f56049X;
        }

        @NotNull
        public final CountryCode getDM() {
            return CountryCode.f56053Y;
        }

        @NotNull
        public final CountryCode getDO() {
            return CountryCode.f56057Z;
        }

        @NotNull
        public final CountryCode getDZ() {
            return CountryCode.f56061a0;
        }

        @NotNull
        public final CountryCode getEA() {
            return CountryCode.f56066b0;
        }

        @NotNull
        public final CountryCode getEC() {
            return CountryCode.f56071c0;
        }

        @NotNull
        public final CountryCode getEE() {
            return CountryCode.f56076d0;
        }

        @NotNull
        public final CountryCode getEG() {
            return CountryCode.f56081e0;
        }

        @NotNull
        public final CountryCode getER() {
            return CountryCode.f56086f0;
        }

        @NotNull
        public final CountryCode getES() {
            return CountryCode.f56091g0;
        }

        @NotNull
        public final CountryCode getET() {
            return CountryCode.f56096h0;
        }

        @NotNull
        public final CountryCode getFI() {
            return CountryCode.f56101i0;
        }

        @NotNull
        public final CountryCode getFK() {
            return CountryCode.f56106j0;
        }

        @NotNull
        public final CountryCode getFM() {
            return CountryCode.f56111k0;
        }

        @NotNull
        public final CountryCode getFR() {
            return CountryCode.f56116l0;
        }

        @NotNull
        public final CountryCode getGA() {
            return CountryCode.f56121m0;
        }

        @NotNull
        public final CountryCode getGB() {
            return CountryCode.f56126n0;
        }

        @NotNull
        public final CountryCode getGE() {
            return CountryCode.f56131o0;
        }

        @NotNull
        public final CountryCode getGF() {
            return CountryCode.f56136p0;
        }

        @NotNull
        public final CountryCode getGG() {
            return CountryCode.f56141q0;
        }

        @NotNull
        public final CountryCode getGI() {
            return CountryCode.f56146r0;
        }

        @NotNull
        public final CountryCode getGL() {
            return CountryCode.f56151s0;
        }

        @NotNull
        public final CountryCode getGM() {
            return CountryCode.f56156t0;
        }

        @NotNull
        public final CountryCode getGN() {
            return CountryCode.f56160u0;
        }

        @NotNull
        public final CountryCode getGP() {
            return CountryCode.f56164v0;
        }

        @NotNull
        public final CountryCode getGR() {
            return CountryCode.f56168w0;
        }

        @NotNull
        public final CountryCode getGS() {
            return CountryCode.f56172x0;
        }

        @NotNull
        public final CountryCode getGT() {
            return CountryCode.f56176y0;
        }

        @NotNull
        public final CountryCode getGU() {
            return CountryCode.f56180z0;
        }

        @NotNull
        public final CountryCode getGW() {
            return CountryCode.f55965A0;
        }

        @NotNull
        public final CountryCode getGY() {
            return CountryCode.f55969B0;
        }

        @NotNull
        public final CountryCode getHK() {
            return CountryCode.f55973C0;
        }

        @NotNull
        public final CountryCode getHR() {
            return CountryCode.f55977D0;
        }

        @NotNull
        public final CountryCode getHT() {
            return CountryCode.f55981E0;
        }

        @NotNull
        public final CountryCode getHU() {
            return CountryCode.f55985F0;
        }

        @NotNull
        public final CountryCode getIC() {
            return CountryCode.f55989G0;
        }

        @NotNull
        public final CountryCode getID() {
            return CountryCode.f56002K0;
        }

        @NotNull
        public final CountryCode getIE() {
            return CountryCode.f56018P0;
        }

        @NotNull
        public final CountryCode getIL() {
            return CountryCode.f56022Q0;
        }

        @NotNull
        public final CountryCode getIM() {
            return CountryCode.f56026R0;
        }

        @NotNull
        public final CountryCode getIN() {
            return CountryCode.f56030S0;
        }

        @NotNull
        public final CountryCode getIO() {
            return CountryCode.f56034T0;
        }

        @NotNull
        public final CountryCode getIQ() {
            return CountryCode.f56038U0;
        }

        @NotNull
        public final CountryCode getIR() {
            return CountryCode.f56042V0;
        }

        @NotNull
        public final CountryCode getIS() {
            return CountryCode.f56046W0;
        }

        @NotNull
        public final CountryCode getIT() {
            return CountryCode.f56050X0;
        }

        @NotNull
        public final CountryCode getJE() {
            return CountryCode.f56054Y0;
        }

        @NotNull
        public final CountryCode getJM() {
            return CountryCode.f56058Z0;
        }

        @NotNull
        public final CountryCode getJO() {
            return CountryCode.f56062a1;
        }

        @NotNull
        public final CountryCode getJP() {
            return CountryCode.f56067b1;
        }

        @NotNull
        public final CountryCode getKE() {
            return CountryCode.f56072c1;
        }

        @NotNull
        public final CountryCode getKG() {
            return CountryCode.f56077d1;
        }

        @NotNull
        public final CountryCode getKH() {
            return CountryCode.f56082e1;
        }

        @NotNull
        public final CountryCode getKI() {
            return CountryCode.f56087f1;
        }

        @NotNull
        public final CountryCode getKP() {
            return CountryCode.f56092g1;
        }

        @NotNull
        public final CountryCode getKR() {
            return CountryCode.f56097h1;
        }

        @NotNull
        public final CountryCode getKW() {
            return CountryCode.f56102i1;
        }

        @NotNull
        public final CountryCode getKY() {
            return CountryCode.f56107j1;
        }

        @NotNull
        public final CountryCode getKZ() {
            return CountryCode.f56112k1;
        }

        @NotNull
        public final CountryCode getLA() {
            return CountryCode.f56117l1;
        }

        @NotNull
        public final CountryCode getLB() {
            return CountryCode.f56122m1;
        }

        @NotNull
        public final CountryCode getLI() {
            return CountryCode.f56127n1;
        }

        @NotNull
        public final CountryCode getLK() {
            return CountryCode.f56132o1;
        }

        @NotNull
        public final CountryCode getLR() {
            return CountryCode.f56137p1;
        }

        @NotNull
        public final CountryCode getLS() {
            return CountryCode.f56142q1;
        }

        @NotNull
        public final CountryCode getLT() {
            return CountryCode.f56147r1;
        }

        @NotNull
        public final CountryCode getLU() {
            return CountryCode.f56152s1;
        }

        @NotNull
        public final CountryCode getLV() {
            return CountryCode.f56157t1;
        }

        @NotNull
        public final CountryCode getLY() {
            return CountryCode.f56161u1;
        }

        @NotNull
        public final CountryCode getMA() {
            return CountryCode.f56165v1;
        }

        @NotNull
        public final CountryCode getMC() {
            return CountryCode.f56169w1;
        }

        @NotNull
        public final CountryCode getME() {
            return CountryCode.f56173x1;
        }

        @NotNull
        public final CountryCode getMF() {
            return CountryCode.f56177y1;
        }

        @NotNull
        public final CountryCode getMG() {
            return CountryCode.f56181z1;
        }

        @NotNull
        public final CountryCode getMH() {
            return CountryCode.f55966A1;
        }

        @NotNull
        public final CountryCode getMK() {
            return CountryCode.f55970B1;
        }

        @NotNull
        public final CountryCode getMM() {
            return CountryCode.f55974C1;
        }

        @NotNull
        public final CountryCode getMN() {
            return CountryCode.f55978D1;
        }

        @NotNull
        public final CountryCode getMO() {
            return CountryCode.f55982E1;
        }

        @NotNull
        public final CountryCode getMP() {
            return CountryCode.f55986F1;
        }

        @NotNull
        public final CountryCode getMQ() {
            return CountryCode.f55990G1;
        }

        @NotNull
        public final CountryCode getMS() {
            return CountryCode.f55993H1;
        }

        @NotNull
        public final CountryCode getMT() {
            return CountryCode.f55996I1;
        }

        @NotNull
        public final CountryCode getMU() {
            return CountryCode.f55999J1;
        }

        @NotNull
        public final CountryCode getMV() {
            return CountryCode.f56003K1;
        }

        @NotNull
        public final CountryCode getMX() {
            return CountryCode.f56006L1;
        }

        @NotNull
        public final CountryCode getMY() {
            return CountryCode.f56009M1;
        }

        @NotNull
        public final CountryCode getMZ() {
            return CountryCode.f56012N1;
        }

        @NotNull
        public final CountryCode getNA() {
            return CountryCode.f56015O1;
        }

        @NotNull
        public final CountryCode getNC() {
            return CountryCode.f56019P1;
        }

        @NotNull
        public final CountryCode getNE() {
            return CountryCode.f56023Q1;
        }

        @NotNull
        public final CountryCode getNF() {
            return CountryCode.f56027R1;
        }

        @NotNull
        public final CountryCode getNG() {
            return CountryCode.f56031S1;
        }

        @NotNull
        public final CountryCode getNI() {
            return CountryCode.f56035T1;
        }

        @NotNull
        public final CountryCode getNL() {
            return CountryCode.f56039U1;
        }

        @NotNull
        public final CountryCode getNO() {
            return CountryCode.f56043V1;
        }

        @NotNull
        public final CountryCode getNP() {
            return CountryCode.f56047W1;
        }

        @NotNull
        public final CountryCode getNR() {
            return CountryCode.f56051X1;
        }

        @NotNull
        public final CountryCode getNZ() {
            return CountryCode.f56055Y1;
        }

        @NotNull
        public final CountryCode getOM() {
            return CountryCode.f56059Z1;
        }

        @NotNull
        public final CountryCode getPA() {
            return CountryCode.f56063a2;
        }

        @NotNull
        public final CountryCode getPE() {
            return CountryCode.f56068b2;
        }

        @NotNull
        public final CountryCode getPF() {
            return CountryCode.f56073c2;
        }

        @NotNull
        public final CountryCode getPG() {
            return CountryCode.f56078d2;
        }

        @NotNull
        public final CountryCode getPH() {
            return CountryCode.f56083e2;
        }

        @NotNull
        public final CountryCode getPK() {
            return CountryCode.f56088f2;
        }

        @NotNull
        public final CountryCode getPL() {
            return CountryCode.f56093g2;
        }

        @NotNull
        public final CountryCode getPM() {
            return CountryCode.f56098h2;
        }

        @NotNull
        public final CountryCode getPN() {
            return CountryCode.f56103i2;
        }

        @NotNull
        public final CountryCode getPR() {
            return CountryCode.f56108j2;
        }

        @NotNull
        public final CountryCode getPS() {
            return CountryCode.f56113k2;
        }

        @NotNull
        public final CountryCode getPT() {
            return CountryCode.f56118l2;
        }

        @NotNull
        public final CountryCode getPW() {
            return CountryCode.f56123m2;
        }

        @NotNull
        public final CountryCode getPY() {
            return CountryCode.f56128n2;
        }

        @NotNull
        public final CountryCode getRE() {
            return CountryCode.f56133o2;
        }

        @NotNull
        public final CountryCode getRO() {
            return CountryCode.f56138p2;
        }

        @NotNull
        public final CountryCode getRS() {
            return CountryCode.f56143q2;
        }

        @NotNull
        public final CountryCode getRU() {
            return CountryCode.f56148r2;
        }

        @NotNull
        public final CountryCode getSA() {
            return CountryCode.f56153s2;
        }

        @NotNull
        public final CountryCode getSD() {
            return CountryCode.f56158t2;
        }

        @NotNull
        public final CountryCode getSE() {
            return CountryCode.f56162u2;
        }

        @NotNull
        public final CountryCode getSG() {
            return CountryCode.f56166v2;
        }

        @NotNull
        public final CountryCode getSH() {
            return CountryCode.f56170w2;
        }

        @NotNull
        public final CountryCode getSI() {
            return CountryCode.f56174x2;
        }

        @NotNull
        public final CountryCode getSJ() {
            return CountryCode.f56178y2;
        }

        @NotNull
        public final CountryCode getSK() {
            return CountryCode.f56182z2;
        }

        @NotNull
        public final CountryCode getSL() {
            return CountryCode.f55967A2;
        }

        @NotNull
        public final CountryCode getSM() {
            return CountryCode.f55971B2;
        }

        @NotNull
        public final CountryCode getSN() {
            return CountryCode.f55975C2;
        }

        @NotNull
        public final CountryCode getSO() {
            return CountryCode.f55979D2;
        }

        @NotNull
        public final CountryCode getSR() {
            return CountryCode.f55983E2;
        }

        @NotNull
        public final CountryCode getSS() {
            return CountryCode.f55987F2;
        }

        @NotNull
        public final CountryCode getSV() {
            return CountryCode.f55991G2;
        }

        @NotNull
        public final CountryCode getSX() {
            return CountryCode.f55994H2;
        }

        @NotNull
        public final CountryCode getSY() {
            return CountryCode.f55997I2;
        }

        @NotNull
        public final CountryCode getSZ() {
            return CountryCode.f56000J2;
        }

        @NotNull
        public final CountryCode getTC() {
            return CountryCode.f56004K2;
        }

        @NotNull
        public final CountryCode getTD() {
            return CountryCode.f56007L2;
        }

        @NotNull
        public final CountryCode getTF() {
            return CountryCode.f56010M2;
        }

        @NotNull
        public final CountryCode getTG() {
            return CountryCode.f56013N2;
        }

        @NotNull
        public final CountryCode getTH() {
            return CountryCode.f56016O2;
        }

        @NotNull
        public final CountryCode getTJ() {
            return CountryCode.f56020P2;
        }

        @NotNull
        public final CountryCode getTL() {
            return CountryCode.f56024Q2;
        }

        @NotNull
        public final CountryCode getTM() {
            return CountryCode.f56028R2;
        }

        @NotNull
        public final CountryCode getTN() {
            return CountryCode.f56032S2;
        }

        @NotNull
        public final CountryCode getTO() {
            return CountryCode.f56036T2;
        }

        @NotNull
        public final CountryCode getTR() {
            return CountryCode.f56040U2;
        }

        @NotNull
        public final CountryCode getTT() {
            return CountryCode.f56044V2;
        }

        @NotNull
        public final CountryCode getTV() {
            return CountryCode.f56048W2;
        }

        @NotNull
        public final CountryCode getTW() {
            return CountryCode.f56052X2;
        }

        @NotNull
        public final CountryCode getTZ() {
            return CountryCode.f56056Y2;
        }

        @NotNull
        public final CountryCode getUA() {
            return CountryCode.f56060Z2;
        }

        @NotNull
        public final CountryCode getUG() {
            return CountryCode.f56064a3;
        }

        @NotNull
        public final CountryCode getUM() {
            return CountryCode.f56069b3;
        }

        @NotNull
        public final CountryCode getUS() {
            return CountryCode.f56074c3;
        }

        @NotNull
        public final CountryCode getUY() {
            return CountryCode.f56079d3;
        }

        @NotNull
        public final CountryCode getUZ() {
            return CountryCode.f56084e3;
        }

        @NotNull
        public final CountryCode getVA() {
            return CountryCode.f56089f3;
        }

        @NotNull
        public final CountryCode getVE() {
            return CountryCode.f56094g3;
        }

        @NotNull
        public final CountryCode getVG() {
            return CountryCode.f56099h3;
        }

        @NotNull
        public final CountryCode getVI() {
            return CountryCode.f56104i3;
        }

        @NotNull
        public final CountryCode getVN() {
            return CountryCode.f56109j3;
        }

        @NotNull
        public final CountryCode getVU() {
            return CountryCode.f56114k3;
        }

        @NotNull
        public final CountryCode getWF() {
            return CountryCode.f56119l3;
        }

        @NotNull
        public final CountryCode getWS() {
            return CountryCode.f56124m3;
        }

        @NotNull
        public final CountryCode getXK() {
            return CountryCode.f56129n3;
        }

        @NotNull
        public final CountryCode getYE() {
            return CountryCode.f56134o3;
        }

        @NotNull
        public final CountryCode getYT() {
            return CountryCode.f56139p3;
        }

        @NotNull
        public final CountryCode getZA() {
            return CountryCode.f56144q3;
        }

        @NotNull
        public final CountryCode getZM() {
            return CountryCode.f56149r3;
        }

        @NotNull
        public final CountryCode getZW() {
            return CountryCode.f56154s3;
        }
    }

    public CountryCode(String str) {
        this.value = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CountryCode) && Intrinsics.areEqual(this.value, ((CountryCode) other).value);
    }

    public /* synthetic */ CountryCode(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static /* synthetic */ CountryCode copy$default(CountryCode countryCode, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryCode.value;
        }
        return countryCode.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountryCode(value=" + this.value + ')';
    }

    @NotNull
    public final CountryCode copy(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new CountryCode(value);
    }
}
