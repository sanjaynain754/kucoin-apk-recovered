package com.sumsub.sns.internal.core.presentation.theme;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.SizeF;
import androidx.core.content.res.ResourcesCompat;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationFileFormat;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTheme;
import com.sumsub.sns.core.theme.SNSThemeColor;
import com.sumsub.sns.core.theme.SNSThemeFont;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.SNSThemeMetric$Size;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28966p implements SNSCustomizationTheme {

    /* JADX INFO: renamed from: f */
    public static final C28964m f58874f = new C28964m();

    /* JADX INFO: renamed from: a */
    public final SNSCustomizationFileFormat f58875a;

    /* JADX INFO: renamed from: b */
    public Map f58876b;

    /* JADX INFO: renamed from: c */
    public Map f58877c;

    /* JADX INFO: renamed from: d */
    public Map f58878d;

    /* JADX INFO: renamed from: e */
    public Map f58879e;

    /* JADX INFO: renamed from: a */
    public final Bitmap m69707a(Context context, C28957e c28957e) {
        String lowerCase;
        String str = c28957e.f58861a;
        if (str == null || (lowerCase = StringsKt.substringBeforeLast$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, C33627eb.f69716f, "", false, 4, (Object) null), "/", "_", false, 4, (Object) null), C33820nf.f71144W, "", false, 4, (Object) null), '.', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT)) == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(lowerCase, "drawable", context.getPackageName());
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), identifier);
        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "loadRNImage: " + c28957e + ", filename: " + lowerCase + ", resId: " + identifier + ", result=" + (bitmapDecodeResource != null ? Integer.valueOf(bitmapDecodeResource.getWidth()) : null) + "x" + (bitmapDecodeResource != null ? Integer.valueOf(bitmapDecodeResource.getHeight()) : null), null, 4, null);
        return bitmapDecodeResource;
    }

    public C28966p(SNSCustomizationFileFormat sNSCustomizationFileFormat) {
        this.f58875a = sNSCustomizationFileFormat;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69706a(C28966p c28966p, SNSTheme sNSTheme) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry entry : AbstractC28458h.m69336a((Map) sNSTheme.getFonts()).entrySet()) {
            map.put(((SNSTypographyElement) entry.getKey()).getValue(), new C28961i("", ((SNSThemeFont) entry.getValue()).getSizeSp(), "", ((SNSThemeFont) entry.getValue()).getTypeface()));
        }
        for (Map.Entry entry2 : AbstractC28458h.m69336a((Map) sNSTheme.getColors()).entrySet()) {
            map2.put(((SNSColorElement) entry2.getKey()).getValue(), new C28955c(Integer.valueOf(((SNSThemeColor) entry2.getValue()).getDark()), Integer.valueOf(((SNSThemeColor) entry2.getValue()).getLight())));
        }
        for (Map.Entry entry3 : AbstractC28458h.m69336a((Map) sNSTheme.getMetrics()).entrySet()) {
            String value = ((SNSMetricElement) entry3.getKey()).getValue();
            Object value2 = entry3.getValue();
            if (value2 instanceof Float) {
                map3.put(value, new C28956d((Float) value2));
            } else if (value2 instanceof SizeF) {
                SizeF sizeF = (SizeF) value2;
                map3.put(value, new C28959g(Float.valueOf(sizeF.getWidth()), Float.valueOf(sizeF.getHeight())));
            } else if (value2 instanceof SNSThemeMetric$Size) {
                map3.put(value, new C28960h(((SNSThemeMetric$Size) value2).getValue()));
            } else if (value2 instanceof SNSThemeMetric$CardStyle) {
                map3.put(value, new C28960h(((SNSThemeMetric$CardStyle) value2).getValue()));
            } else if (value2 instanceof SNSThemeMetric$TextAlignment) {
                map3.put(value, new C28960h(((SNSThemeMetric$TextAlignment) value2).getValue()));
            }
        }
        c28966p.f58876b = map;
        c28966p.f58877c = map2;
        c28966p.f58878d = map3;
    }

    /* JADX INFO: renamed from: a */
    public final void m69709a(Context context) {
        String str;
        Collection<AbstractC28962j> collectionValues;
        Bitmap bitmapM69708a;
        Collection<C28961i> collectionValues2;
        Collection<AbstractC28962j> collectionValues3;
        Collection<C28961i> collectionValues4;
        int i11 = AbstractC28965n.f58873a[this.f58875a.ordinal()];
        if (i11 == 1 || i11 == 2) {
            str = "";
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str = "flutter_assets/";
        }
        SNSCustomizationFileFormat sNSCustomizationFileFormat = this.f58875a;
        if (sNSCustomizationFileFormat != SNSCustomizationFileFormat.CORDOVA && sNSCustomizationFileFormat != SNSCustomizationFileFormat.FLUTTER) {
            if (sNSCustomizationFileFormat == SNSCustomizationFileFormat.REACT_NATIVE) {
                Map map = this.f58876b;
                if (map != null && (collectionValues4 = map.values()) != null) {
                    for (C28961i c28961i : collectionValues4) {
                        try {
                            C33272c c33272c = C33272c.f67812a;
                            Logger.DefaultImpls.d$default(c33272c, AbstractC33294e.m71624a(this), "Loading typeface " + c28961i.f58871c, null, 4, null);
                            String lowerCase = StringsKt.substringBeforeLast$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(c28961i.f58871c, C33627eb.f69716f, "", false, 4, (Object) null), "/", "_", false, 4, (Object) null), C33820nf.f71144W, "", false, 4, (Object) null), '.', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
                            Logger.DefaultImpls.d$default(c33272c, AbstractC33294e.m71624a(this), "filename=" + lowerCase, null, 4, null);
                            int identifier = context.getResources().getIdentifier(lowerCase, "raw", context.getPackageName());
                            Logger.DefaultImpls.d$default(c33272c, AbstractC33294e.m71624a(this), "resId=" + identifier, null, 4, null);
                            c28961i.f58872d = ResourcesCompat.getFont(context, identifier);
                        } catch (Exception e11) {
                            C33272c c33272c2 = C33272c.f67812a;
                            String strM71624a = AbstractC33294e.m71624a(this);
                            String message = e11.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            C33272c.f67814c.mo68956e(strM71624a, message, e11);
                        }
                    }
                }
                Map map2 = this.f58879e;
                if (map2 == null || (collectionValues3 = map2.values()) == null) {
                    return;
                }
                for (AbstractC28962j abstractC28962j : collectionValues3) {
                    if (abstractC28962j instanceof C28957e) {
                        C28957e c28957e = (C28957e) abstractC28962j;
                        c28957e.f58864d = m69707a(context, c28957e);
                    } else if (abstractC28962j instanceof C28958f) {
                        for (C28957e c28957e2 : ((C28958f) abstractC28962j).f58865a.values()) {
                            c28957e2.f58864d = m69707a(context, c28957e2);
                        }
                    } else {
                        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Theme: Invalid element in images: " + abstractC28962j, null, 4, null);
                    }
                }
                return;
            }
            return;
        }
        Map map3 = this.f58876b;
        if (map3 != null && (collectionValues2 = map3.values()) != null) {
            for (C28961i c28961i2 : collectionValues2) {
                try {
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Loading typeface " + c28961i2.f58871c, null, 4, null);
                    c28961i2.f58872d = Typeface.createFromAsset(context.getResources().getAssets(), str + c28961i2.f58871c);
                } catch (Exception e12) {
                    C33272c c33272c3 = C33272c.f67812a;
                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "", e12);
                }
            }
        }
        Map map4 = this.f58879e;
        if (map4 == null || (collectionValues = map4.values()) == null) {
            return;
        }
        for (AbstractC28962j abstractC28962j2 : collectionValues) {
            if (abstractC28962j2 instanceof C28957e) {
                C28957e c28957e3 = (C28957e) abstractC28962j2;
                String str2 = c28957e3.f58861a;
                c28957e3.f58864d = str2 != null ? m69708a(context.getResources().getAssets(), str + str2) : null;
            } else if (abstractC28962j2 instanceof C28958f) {
                for (C28957e c28957e4 : ((C28958f) abstractC28962j2).f58865a.values()) {
                    String str3 = c28957e4.f58861a;
                    if (str3 != null) {
                        bitmapM69708a = m69708a(context.getResources().getAssets(), str + str3);
                        Integer num = c28957e4.f58862b;
                        if ((num != null ? num.intValue() : 1) > 1 && bitmapM69708a != null) {
                            Integer num2 = c28957e4.f58862b;
                            int iIntValue = num2 != null ? num2.intValue() : 1;
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM69708a, bitmapM69708a.getWidth() * iIntValue, bitmapM69708a.getHeight() * iIntValue, true);
                            bitmapM69708a.recycle();
                            bitmapM69708a = bitmapCreateScaledBitmap;
                        }
                    } else {
                        bitmapM69708a = null;
                    }
                    c28957e4.f58864d = bitmapM69708a;
                }
            } else {
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Theme: Invalid element in images: " + abstractC28962j2, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m69708a(AssetManager assetManager, String str) {
        try {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Loading image " + str, null, 4, null);
            return BitmapFactory.decodeStream(assetManager.open(str));
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68955d(strM71624a, message, e11);
            return null;
        }
    }
}
