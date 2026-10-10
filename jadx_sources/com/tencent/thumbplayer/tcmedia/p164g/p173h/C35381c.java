package com.tencent.thumbplayer.tcmedia.p164g.p173h;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import androidx.camera.video.internal.encoder.EncoderConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35365e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.h.c */
/* JADX INFO: loaded from: classes64.dex */
public final class C35381c {

    /* JADX INFO: renamed from: a */
    public static final String[] f76193a = {EncoderConfig.KEY_CSD_0, EncoderConfig.KEY_CSD_1, EncoderConfig.KEY_CSD_2};

    /* JADX INFO: renamed from: b */
    private static boolean f76194b;

    /* JADX INFO: renamed from: c */
    private static boolean f76195c;

    /* JADX INFO: renamed from: d */
    private static final Set<String> f76196d;

    static {
        HashSet hashSet = new HashSet();
        f76196d = hashSet;
        hashSet.add("1601");
        hashSet.add("1713");
        hashSet.add("1714");
        hashSet.add("A10-70F");
        hashSet.add("A10-70L");
        hashSet.add("A1601");
        hashSet.add("A2016a40");
        hashSet.add("A7000-a");
        hashSet.add("A7000plus");
        hashSet.add("A7010a48");
        hashSet.add("A7020a48");
        hashSet.add("AquaPowerM");
        hashSet.add("ASUS_X00AD_2");
        hashSet.add("Aura_Note_2");
        hashSet.add("BLACK-1X");
        hashSet.add("BRAVIA_ATV2");
        hashSet.add("BRAVIA_ATV3_4K");
        hashSet.add("C1");
        hashSet.add("ComioS1");
        hashSet.add("CP8676_I02");
        hashSet.add("CPH1609");
        hashSet.add("CPY83_I00");
        hashSet.add("cv1");
        hashSet.add("cv3");
        hashSet.add("deb");
        hashSet.add("E5643");
        hashSet.add("ELUGA_A3_Pro");
        hashSet.add("ELUGA_Note");
        hashSet.add("ELUGA_Prim");
        hashSet.add("ELUGA_Ray_X");
        hashSet.add("EverStar_S");
        hashSet.add("F3111");
        hashSet.add("F3113");
        hashSet.add("F3116");
        hashSet.add("F3211");
        hashSet.add("F3213");
        hashSet.add("F3215");
        hashSet.add("F3311");
        hashSet.add("flo");
        hashSet.add("fugu");
        hashSet.add("GiONEE_CBL7513");
        hashSet.add("GiONEE_GBL7319");
        hashSet.add("GIONEE_GBL7360");
        hashSet.add("GIONEE_SWW1609");
        hashSet.add("GIONEE_SWW1627");
        hashSet.add("GIONEE_SWW1631");
        hashSet.add("GIONEE_WBL5708");
        hashSet.add("GIONEE_WBL7365");
        hashSet.add("GIONEE_WBL7519");
        hashSet.add("griffin");
        hashSet.add("htc_e56ml_dtul");
        hashSet.add("hwALE-H");
        hashSet.add("HWBLN-H");
        hashSet.add("HWCAM-H");
        hashSet.add("HWVNS-H");
        hashSet.add("HWWAS-H");
        hashSet.add("i9031");
        hashSet.add("iball8735_9806");
        hashSet.add("Infinix-X572");
        hashSet.add("iris60");
        hashSet.add("itel_S41");
        hashSet.add("j2xlteins");
        hashSet.add("JGZ");
        hashSet.add("K50a40");
        hashSet.add("kate");
        hashSet.add("l5460");
        hashSet.add("le_x6");
        hashSet.add("LS-5017");
        hashSet.add("M5c");
        hashSet.add("manning");
        hashSet.add("marino_f");
        hashSet.add("MEIZU_M5");
        hashSet.add("mh");
        hashSet.add("mido");
        hashSet.add("c");
        hashSet.add("namath");
        hashSet.add("nicklaus_f");
        hashSet.add("NX541J");
        hashSet.add("NX573J");
        hashSet.add("OnePlus5T");
        hashSet.add("p212");
        hashSet.add("P681");
        hashSet.add("P85");
        hashSet.add("panell_d");
        hashSet.add("panell_dl");
        hashSet.add("panell_ds");
        hashSet.add("panell_dt");
        hashSet.add("PB2-670M");
        hashSet.add("PGN528");
        hashSet.add("PGN610");
        hashSet.add("PGN611");
        hashSet.add("Phantom6");
        hashSet.add("Pixi4-7_3G");
        hashSet.add("Pixi5-10_4G");
        hashSet.add("PLE");
        hashSet.add("PRO7S");
        hashSet.add("Q350");
        hashSet.add("Q4260");
        hashSet.add("Q427");
        hashSet.add("Q4310");
        hashSet.add("Q5");
        hashSet.add("QM16XE_U");
        hashSet.add("QX1");
        hashSet.add("santoni");
        hashSet.add("Slate_Pro");
        hashSet.add("SVP-DTV15");
        hashSet.add("s905x018");
        hashSet.add("taido_row");
        hashSet.add("TB3-730F");
        hashSet.add("TB3-730X");
        hashSet.add("TB3-850F");
        hashSet.add("TB3-850M");
        hashSet.add("tcl_eu");
        hashSet.add("V1");
        hashSet.add("V23GB");
        hashSet.add("V5");
        hashSet.add("vernee_M5");
        hashSet.add("watson");
        hashSet.add("whyred");
        hashSet.add("woods_f");
        hashSet.add("woods_fn");
        hashSet.add("X3_HK");
        hashSet.add("XE2X");
        hashSet.add("XT1663");
        hashSet.add("Z12_PRO");
        hashSet.add("Z80");
    }

    /* JADX INFO: renamed from: a */
    public static int m78339a(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    /* JADX INFO: renamed from: a */
    public static int m78340a(AbstractC35366f abstractC35366f, C35365e c35365e) {
        if (c35365e.f76087i == -1) {
            return m78341a(c35365e.f76088j, c35365e.f76080b, c35365e.f76081c, abstractC35366f.f76097d);
        }
        int length = 0;
        for (int i11 = 0; i11 < c35365e.f76079a.size(); i11++) {
            length += c35365e.f76079a.get(i11).length;
        }
        return c35365e.f76087i + length;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m78348c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX INFO: renamed from: d */
    private static boolean m78349d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* JADX INFO: renamed from: a */
    public static int m78341a(String str, int i11, int i12, boolean z11) {
        int iM78339a;
        int i13 = 4;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iM78339a = i11 * i12;
                i13 = 2;
                return (iM78339a * 3) / (i13 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iM78339a = i11 * i12;
                return (iM78339a * 3) / (i13 * 2);
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(TPSystemInfo.getDeviceName()) || ("Amazon".equals(TPSystemInfo.getDeviceManufacturer()) && ("KFSOWI".equals(TPSystemInfo.getDeviceName()) || ("AFTS".equals(TPSystemInfo.getDeviceName()) && z11)))) {
                    return -1;
                }
                iM78339a = m78339a(i11, 16) * m78339a(i12, 16) * 256;
                i13 = 2;
                return (iM78339a * 3) / (i13 * 2);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m78347b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (m78349d(codecCapabilities)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m78342a(MediaCodec mediaCodec) {
        return mediaCodec.getName();
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<byte[]> m78343a(MediaFormat mediaFormat) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i11 = 0;
        while (true) {
            String[] strArr = f76193a;
            if (i11 >= strArr.length) {
                return arrayList;
            }
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(strArr[i11]);
            if (byteBuffer != null) {
                arrayList.add(byteBuffer.array());
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:10:0x0018, B:16:0x0026, B:18:0x002e, B:19:0x0030, B:26:0x0049, B:29:0x0053, B:32:0x005d, B:41:0x0071, B:43:0x0077, B:44:0x008c, B:40:0x006f, B:45:0x008e), top: B:50:0x0003 }] */
    /* JADX INFO: renamed from: a */
    public static boolean m78344a() {
        int i11;
        byte b11;
        synchronized (C35381c.class) {
            try {
                if (!f76194b) {
                    String str = Build.DEVICE;
                    if ("dangal".equals(str) || ((i11 = Build.VERSION.SDK_INT) <= 27 && "HWEML".equals(str))) {
                        f76195c = true;
                    } else if (i11 < 27) {
                        if (f76196d.contains(str)) {
                            f76195c = true;
                        }
                        String deviceName = TPSystemInfo.getDeviceName();
                        int iHashCode = deviceName.hashCode();
                        if (iHashCode != -594534941) {
                            if (iHashCode != 2006354) {
                                if (iHashCode == 2006367 && deviceName.equals("AFTN")) {
                                    b11 = 1;
                                } else {
                                    b11 = -1;
                                }
                            } else if (deviceName.equals("AFTA")) {
                                b11 = 0;
                            } else {
                                b11 = -1;
                            }
                        } else if (deviceName.equals("JSN-L21")) {
                            b11 = 2;
                        } else {
                            b11 = -1;
                        }
                        if (b11 == 0 || b11 == 1 || b11 == 2) {
                            f76195c = true;
                        }
                    }
                    if (C35380b.m78332a()) {
                        C35380b.m78334b("TUtils", "deviceNeedsSetOutputSurfaceWorkaround:" + f76195c);
                    }
                    f76194b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f76195c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78345a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m78348c(codecCapabilities);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78346a(String str) {
        return str.contains("video");
    }
}
