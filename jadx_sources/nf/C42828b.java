package nf;

import android.text.SpannableStringBuilder;
import androidx.core.text.BidiFormatter;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.R$string;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.exception.CoinDataException;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: nf.b */
/* JADX INFO: compiled from: StringExtension.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0007\u001a(\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a&\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\u001c\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001\u001a$\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u001c"}, m90084d2 = {"toCode", "", "toCurrency", "toSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "withSymbol", "code", "withCoin", "coin", "adjustPercentageForRtl", "appendSymbol", "symbol", "isEnd", "", "isAddSpace", "appendSymbolWithSpan", "", "formatWithCurrencyRtl", FirebaseAnalytics.Param.CURRENCY, "separator", "appendStyleSymbol", "Lcom/kubi/utils/StyledText;", "space", "unicodeWrap", "adjustForRtl", TtmlNode.RUBY_DELIMITER, "reverseNumericForRtl", "adjustNumericForRtl", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStringExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtension.kt\ncom/kubi/data/util/StringExtensionKt\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,276:1\n45#2,4:277\n45#2,4:281\n45#2,4:285\n45#2,4:289\n*S KotlinDebug\n*F\n+ 1 StringExtension.kt\ncom/kubi/data/util/StringExtensionKt\n*L\n67#1:277,4\n188#1:281,4\n213#1:285,4\n273#1:289,4\n*E\n"})
public final class C42828b {
    /* JADX WARN: Code duplicated, block: B:112:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d2 A[Catch: all -> 0x00cf, TryCatch #10 {all -> 0x00cf, blocks: (B:39:0x00c2, B:51:0x00e0, B:53:0x00e8, B:55:0x00f0, B:59:0x0107, B:60:0x0127, B:71:0x017a, B:73:0x0188, B:75:0x0190, B:77:0x0198, B:81:0x01af, B:82:0x01d0, B:91:0x021f, B:93:0x022d, B:95:0x0235, B:97:0x023d, B:101:0x0254, B:102:0x0275, B:111:0x02c4, B:113:0x02d2, B:115:0x02d8, B:119:0x02ea), top: B:147:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02f8 A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:62:0x012d, B:84:0x01d6, B:104:0x027b, B:122:0x02f8, B:124:0x02fe), top: B:145:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0320 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #8 {all -> 0x00ab, blocks: (B:131:0x0320, B:30:0x0086, B:64:0x0138, B:86:0x01e1, B:106:0x0286, B:126:0x0304), top: B:159:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0329 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x033e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0188 A[Catch: all -> 0x00cf, TryCatch #10 {all -> 0x00cf, blocks: (B:39:0x00c2, B:51:0x00e0, B:53:0x00e8, B:55:0x00f0, B:59:0x0107, B:60:0x0127, B:71:0x017a, B:73:0x0188, B:75:0x0190, B:77:0x0198, B:81:0x01af, B:82:0x01d0, B:91:0x021f, B:93:0x022d, B:95:0x0235, B:97:0x023d, B:101:0x0254, B:102:0x0275, B:111:0x02c4, B:113:0x02d2, B:115:0x02d8, B:119:0x02ea), top: B:147:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x022b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x022d A[Catch: all -> 0x00cf, TryCatch #10 {all -> 0x00cf, blocks: (B:39:0x00c2, B:51:0x00e0, B:53:0x00e8, B:55:0x00f0, B:59:0x0107, B:60:0x0127, B:71:0x017a, B:73:0x0188, B:75:0x0190, B:77:0x0198, B:81:0x01af, B:82:0x01d0, B:91:0x021f, B:93:0x022d, B:95:0x0235, B:97:0x023d, B:101:0x0254, B:102:0x0275, B:111:0x02c4, B:113:0x02d2, B:115:0x02d8, B:119:0x02ea), top: B:147:0x0014 }] */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m93902c(@Nullable String str) {
        String str2;
        Throwable th2;
        Throwable thM103847exceptionOrNullimpl;
        String string;
        String string2;
        String str3;
        String str4;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                if (C5303w0.m6511a()) {
                    str2 = null;
                    try {
                        try {
                            if (str != null) {
                                try {
                                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) ">", false, 2, (Object) null)) {
                                        if (StringsKt.contains$default((CharSequence) str, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                StringBuilder sb3 = new StringBuilder();
                                                str2 = str;
                                                try {
                                                    str4 = str2;
                                                    try {
                                                        sb3.append(StringsKt.replaceFirst$default(str2, C33820nf.f71144W, "", false, 4, (Object) null));
                                                        sb3.append('-');
                                                        sb2.append(StringsKt.replaceFirst$default(sb3.toString(), ">", "", false, 4, (Object) null));
                                                        sb2.append(Typography.less);
                                                        str2 = str4;
                                                        string2 = sb2.toString();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        th2 = th;
                                                        str2 = str4;
                                                        Result.Companion companion2 = Result.INSTANCE;
                                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                                                        if (thM103847exceptionOrNullimpl != null) {
                                                            C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
                                                        }
                                                        return str2;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str4 = str;
                                            }
                                        } else {
                                            try {
                                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "+", false, 2, (Object) null)) {
                                                    try {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        StringBuilder sb5 = new StringBuilder();
                                                        str2 = str;
                                                        sb5.append(StringsKt.replaceFirst$default(str2, "+", "", false, 4, (Object) null));
                                                        sb5.append('+');
                                                        sb4.append(StringsKt.replaceFirst$default(sb5.toString(), ">", "", false, 4, (Object) null));
                                                        sb4.append(Typography.less);
                                                        string2 = sb4.toString();
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        str2 = str;
                                                    }
                                                } else {
                                                    StringBuilder sb6 = new StringBuilder();
                                                    str3 = str;
                                                    sb6.append(StringsKt.replaceFirst$default(str, ">", "", false, 4, (Object) null));
                                                    sb6.append(Typography.less);
                                                    string2 = sb6.toString();
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                str3 = str;
                                                th2 = th;
                                                str2 = str3;
                                                Result.Companion companion3 = Result.INSTANCE;
                                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                                                if (thM103847exceptionOrNullimpl != null) {
                                                    C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
                                                }
                                                return str2;
                                            }
                                        }
                                        Result.Companion companion4 = Result.INSTANCE;
                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                                        if (thM103847exceptionOrNullimpl != null && !C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                                            C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
                                        }
                                        return str2;
                                    }
                                    string = str;
                                    try {
                                        if (string == null && StringsKt.contains$default((CharSequence) string, (CharSequence) "<", false, 2, (Object) null)) {
                                            if (StringsKt.contains$default((CharSequence) string, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                                                StringBuilder sb7 = new StringBuilder();
                                                StringBuilder sb8 = new StringBuilder();
                                                String strReplaceFirst$default = StringsKt.replaceFirst$default(string, C33820nf.f71144W, "", false, 4, (Object) null);
                                                str3 = string;
                                                sb8.append(strReplaceFirst$default);
                                                sb8.append('-');
                                                sb7.append(StringsKt.replaceFirst$default(sb8.toString(), "<", "", false, 4, (Object) null));
                                                sb7.append(Typography.greater);
                                                string2 = sb7.toString();
                                            } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) "+", false, 2, (Object) null)) {
                                                StringBuilder sb9 = new StringBuilder();
                                                StringBuilder sb10 = new StringBuilder();
                                                str2 = string;
                                                sb10.append(StringsKt.replaceFirst$default(str2, "+", "", false, 4, (Object) null));
                                                sb10.append('+');
                                                string = sb10.toString();
                                                sb9.append(StringsKt.replaceFirst$default(string, "<", "", false, 4, (Object) null));
                                                sb9.append(Typography.greater);
                                                string2 = sb9.toString();
                                            } else {
                                                StringBuilder sb11 = new StringBuilder();
                                                String strReplaceFirst$default2 = StringsKt.replaceFirst$default(string, "<", "", false, 4, (Object) null);
                                                str3 = string;
                                                sb11.append(strReplaceFirst$default2);
                                                sb11.append(Typography.greater);
                                                string2 = sb11.toString();
                                            }
                                        } else if (string == null && StringsKt.contains$default((CharSequence) string, (CharSequence) "≥", false, 2, (Object) null)) {
                                            if (StringsKt.contains$default((CharSequence) string, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                                                StringBuilder sb12 = new StringBuilder();
                                                StringBuilder sb13 = new StringBuilder();
                                                String strReplaceFirst$default3 = StringsKt.replaceFirst$default(string, C33820nf.f71144W, "", false, 4, (Object) null);
                                                str3 = string;
                                                sb13.append(strReplaceFirst$default3);
                                                sb13.append('-');
                                                sb12.append(StringsKt.replaceFirst$default(sb13.toString(), "≥", "", false, 4, (Object) null));
                                                sb12.append(Typography.lessOrEqual);
                                                string2 = sb12.toString();
                                            } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) "+", false, 2, (Object) null)) {
                                                StringBuilder sb14 = new StringBuilder();
                                                StringBuilder sb15 = new StringBuilder();
                                                str2 = string;
                                                sb15.append(StringsKt.replaceFirst$default(str2, "+", "", false, 4, (Object) null));
                                                sb15.append('+');
                                                string = sb15.toString();
                                                sb14.append(StringsKt.replaceFirst$default(string, "≥", "", false, 4, (Object) null));
                                                sb14.append(Typography.lessOrEqual);
                                                string2 = sb14.toString();
                                            } else {
                                                StringBuilder sb16 = new StringBuilder();
                                                String strReplaceFirst$default4 = StringsKt.replaceFirst$default(string, "≥", "", false, 4, (Object) null);
                                                str3 = string;
                                                sb16.append(strReplaceFirst$default4);
                                                sb16.append(Typography.lessOrEqual);
                                                string2 = sb16.toString();
                                            }
                                        } else if (string == null && StringsKt.contains$default((CharSequence) string, (CharSequence) "≤", false, 2, (Object) null)) {
                                            if (StringsKt.contains$default((CharSequence) string, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                                                StringBuilder sb17 = new StringBuilder();
                                                StringBuilder sb18 = new StringBuilder();
                                                String strReplaceFirst$default5 = StringsKt.replaceFirst$default(string, C33820nf.f71144W, "", false, 4, (Object) null);
                                                str3 = string;
                                                sb18.append(strReplaceFirst$default5);
                                                sb18.append('-');
                                                sb17.append(StringsKt.replaceFirst$default(sb18.toString(), "≤", "", false, 4, (Object) null));
                                                sb17.append(Typography.greaterOrEqual);
                                                string2 = sb17.toString();
                                            } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) "+", false, 2, (Object) null)) {
                                                StringBuilder sb19 = new StringBuilder();
                                                StringBuilder sb20 = new StringBuilder();
                                                str2 = string;
                                                sb20.append(StringsKt.replaceFirst$default(str2, "+", "", false, 4, (Object) null));
                                                sb20.append('+');
                                                string = sb20.toString();
                                                sb19.append(StringsKt.replaceFirst$default(string, "≤", "", false, 4, (Object) null));
                                                sb19.append(Typography.greaterOrEqual);
                                                string2 = sb19.toString();
                                            } else {
                                                StringBuilder sb21 = new StringBuilder();
                                                String strReplaceFirst$default6 = StringsKt.replaceFirst$default(string, "≤", "", false, 4, (Object) null);
                                                str3 = string;
                                                sb21.append(strReplaceFirst$default6);
                                                sb21.append(Typography.greaterOrEqual);
                                                string2 = sb21.toString();
                                            }
                                        } else if (string == null && StringsKt.contains$default((CharSequence) string, (CharSequence) "+", false, 2, (Object) null)) {
                                            StringBuilder sb22 = new StringBuilder();
                                            String strReplaceFirst$default7 = StringsKt.replaceFirst$default(string, "+", "", false, 4, (Object) null);
                                            str3 = string;
                                            sb22.append(strReplaceFirst$default7);
                                            sb22.append('+');
                                            string2 = sb22.toString();
                                        } else if (string == null && StringsKt.contains$default((CharSequence) string, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                                            StringBuilder sb23 = new StringBuilder();
                                            str2 = string;
                                            string = C33820nf.f71144W;
                                            sb23.append(StringsKt.replaceFirst$default(str2, C33820nf.f71144W, "", false, 4, (Object) null));
                                            sb23.append('-');
                                            string2 = sb23.toString();
                                        } else {
                                            str2 = string;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str2 = string;
                                    }
                                    str2 = str3;
                                } catch (Throwable th9) {
                                    th = th9;
                                    str3 = str;
                                }
                            } else {
                                string = str;
                                if (string == null) {
                                    if (string == null) {
                                        if (string == null) {
                                            if (string == null) {
                                            }
                                            if (string == null) {
                                            }
                                            str2 = string;
                                        } else {
                                            if (string == null) {
                                            }
                                            if (string == null) {
                                            }
                                            str2 = string;
                                        }
                                    } else if (string == null) {
                                        if (string == null) {
                                        }
                                        if (string == null) {
                                        }
                                        str2 = string;
                                    } else {
                                        if (string == null) {
                                        }
                                        if (string == null) {
                                        }
                                        str2 = string;
                                    }
                                } else if (string == null) {
                                    if (string == null) {
                                        if (string == null) {
                                        }
                                        if (string == null) {
                                        }
                                        str2 = string;
                                    } else {
                                        if (string == null) {
                                        }
                                        if (string == null) {
                                        }
                                        str2 = string;
                                    }
                                } else if (string == null) {
                                    if (string == null) {
                                    }
                                    if (string == null) {
                                    }
                                    str2 = string;
                                } else {
                                    if (string == null) {
                                    }
                                    if (string == null) {
                                    }
                                    str2 = string;
                                }
                            }
                            if (string2 != null) {
                                return BidiFormatter.getInstance().unicodeWrap(string2);
                            }
                            return null;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                    th2 = th;
                    Result.Companion companion5 = Result.INSTANCE;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                    if (thM103847exceptionOrNullimpl != null) {
                        C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
                    }
                    return str2;
                }
                str2 = str;
                string2 = str2;
                if (string2 != null) {
                    return BidiFormatter.getInstance().unicodeWrap(string2);
                }
                return null;
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            str2 = str;
        }
        th2 = th;
        Result.Companion companion6 = Result.INSTANCE;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
        }
        return str2;
    }

    @Deprecated(message = "使用新的数字规范，BigDecimal.formatPercentRegular()，注意textview的方向不要设置强制，rtl自动适配")
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m93903d(@Nullable String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (C5303w0.m6511a()) {
                String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
                if (string == null || !StringsKt.endsWith$default(string, "%", false, 2, (Object) null)) {
                    return str;
                }
                String strSubstring = string.substring(0, string.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return '%' + m93911l(strSubstring);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            if (thM103847exceptionOrNullimpl != null && !C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "StringExtension-adjustPercentageForArabic", false, null, 8, null), null, 2, null);
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:24:0x0043, B:26:0x004b), top: B:55:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:55:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final String m93911l(@Nullable String str) {
        String str2;
        Throwable th2;
        Throwable thM103847exceptionOrNullimpl;
        String str3;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!C5303w0.m6511a()) {
                return str;
            }
            if (str != null) {
                try {
                    if (StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
                        StringBuilder sb2 = new StringBuilder();
                        str2 = str;
                        try {
                            str3 = str2;
                            try {
                                sb2.append(StringsKt.replaceFirst$default(str2, "+", "", false, 4, (Object) null));
                                sb2.append('+');
                                return sb2.toString();
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                str2 = str3;
                                Result.Companion companion2 = Result.INSTANCE;
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                                return thM103847exceptionOrNullimpl == null ? str2 : str2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        if (str != null) {
                            return str;
                        }
                        try {
                            if (StringsKt.startsWith$default(str, C33820nf.f71144W, false, 2, (Object) null)) {
                                return str;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            str2 = str;
                            try {
                                sb3.append(StringsKt.replaceFirst$default(str2, C33820nf.f71144W, "", false, 4, (Object) null));
                                sb3.append('-');
                                return sb3.toString();
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str2 = str;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    str3 = str;
                }
                th2 = th;
            } else {
                if (str != null) {
                    return str;
                }
                if (StringsKt.startsWith$default(str, C33820nf.f71144W, false, 2, (Object) null)) {
                    return str;
                }
                StringBuilder sb4 = new StringBuilder();
                str2 = str;
                sb4.append(StringsKt.replaceFirst$default(str2, C33820nf.f71144W, "", false, 4, (Object) null));
                sb4.append('-');
                return sb4.toString();
                th2 = th;
            }
            Result.Companion companion3 = Result.INSTANCE;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            if (thM103847exceptionOrNullimpl == null && !C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
                return str2;
            }
        } catch (Throwable th8) {
            th = th8;
            str2 = str;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m93900a(@Nullable String str, @NotNull String delimiter) {
        String str2;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!C5303w0.m6511a()) {
                return str;
            }
            if (str != null) {
                str2 = str;
                try {
                    listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{delimiter}, false, 0, 6, (Object) null);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                str2 = str;
                listSplit$default = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(listSplit$default != null ? (String) listSplit$default.get(1) : null);
            sb2.append(delimiter);
            sb2.append(listSplit$default != null ? (String) listSplit$default.get(0) : null);
            return sb2.toString();
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
        }
        Throwable th4 = th;
        Result.Companion companion2 = Result.INSTANCE;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th4)));
        if (thM103847exceptionOrNullimpl == null || C42899b.m94075e(thM103847exceptionOrNullimpl)) {
            return str2;
        }
        C43846g.m96568c(new CoinDataException(thM103847exceptionOrNullimpl, "AssetEx-adjustForRtl", false, null, 8, null), null, 2, null);
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m93901b(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = C33627eb.f69716f;
        }
        return m93900a(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C27096v0 m93904e(@NotNull C27096v0 c27096v0, @NotNull C27096v0 symbol, @NotNull C27096v0 space, boolean z11) {
        Intrinsics.checkNotNullParameter(c27096v0, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(space, "space");
        C27096v0 c27096v1 = new C27096v0();
        if (C5303w0.m6511a()) {
            if (z11) {
                c27096v1.append(symbol).append(space).append(c27096v0);
                return c27096v1;
            }
            c27096v1.append(c27096v0).append(space).append(symbol);
            return c27096v1;
        }
        if (z11) {
            c27096v1.append(c27096v0).append(space).append(symbol);
            return c27096v1;
        }
        c27096v1.append(symbol).append(space).append(c27096v0);
        return c27096v1;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m93905f(@Nullable String str, @NotNull String symbol, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String str2 = z12 ? C33627eb.f69716f : "";
        if (C5303w0.m6511a()) {
            if (z11) {
                return symbol + str2 + str;
            }
            return str + str2 + symbol;
        }
        if (z11) {
            return str + str2 + symbol;
        }
        return symbol + str2 + str;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m93906g(String str, String str2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return m93905f(str, str2, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final CharSequence m93907h(@NotNull CharSequence charSequence, @NotNull String symbol, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (StringsKt.isBlank(symbol)) {
            return charSequence;
        }
        String str = z12 ? C33627eb.f69716f : "";
        if (C5303w0.m6511a()) {
            SpannableStringBuilder spannableStringBuilderAppend = z11 ? new SpannableStringBuilder().append((CharSequence) symbol).append((CharSequence) str).append(charSequence) : new SpannableStringBuilder().append(charSequence).append((CharSequence) str).append((CharSequence) symbol);
            Intrinsics.checkNotNull(spannableStringBuilderAppend);
            return spannableStringBuilderAppend;
        }
        SpannableStringBuilder spannableStringBuilderAppend2 = z11 ? new SpannableStringBuilder(charSequence).append((CharSequence) str).append((CharSequence) symbol) : new SpannableStringBuilder().append((CharSequence) symbol).append((CharSequence) str).append(charSequence);
        Intrinsics.checkNotNull(spannableStringBuilderAppend2);
        return spannableStringBuilderAppend2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m93908i(CharSequence charSequence, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return m93907h(charSequence, str, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m93909j(@NotNull String str, @NotNull String currency, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(separator, "separator");
        if (Intrinsics.areEqual(str, C27017c.f54310a.m66516f(R$string.stub, new Object[0])) || !C5303w0.m6511a()) {
            return str + separator + currency;
        }
        if (StringsKt.startsWith$default(str, C33820nf.f71144W, false, 2, (Object) null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currency);
            sb2.append(separator);
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append('-');
            return sb2.toString();
        }
        if (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            return currency + separator + str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(currency);
        sb3.append(separator);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb3.append(strSubstring2);
        sb3.append('+');
        return sb3.toString();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m93910k(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = C33627eb.f69716f;
        }
        return m93909j(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m93912m(@NotNull String str) {
        String code;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
        return (coinInfoEntityM85613u == null || (code = coinInfoEntityM85613u.getCode()) == null) ? str : code;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m93913n(@NotNull String str) {
        String currency;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
        return (coinInfoEntityM85613u == null || (currency = coinInfoEntityM85613u.getCurrency()) == null) ? str : currency;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final SymbolInfoEntity m93914o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return C37890n.f85269a.m85601B(str);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static final String m93915p(@Nullable String str) {
        if (str != null) {
            return BidiFormatter.getInstance().unicodeWrap(str);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m93917r(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str2);
        return m93916q(str, C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getQuoteCurrencyName() : null));
    }

    /* JADX INFO: renamed from: q */
    public static final String m93916q(String str, String str2) {
        if (C5303w0.m6511a()) {
            if (StringsKt.startsWith$default(str, C33820nf.f71144W, false, 2, (Object) null)) {
                return '-' + str2 + ' ' + StringsKt.replaceFirst$default(str, C33820nf.f71144W, "", false, 4, (Object) null);
            }
            if (StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
                return '+' + str2 + ' ' + StringsKt.replaceFirst$default(str, "+", "", false, 4, (Object) null);
            }
            return str2 + ' ' + str;
        }
        return str + ' ' + str2;
    }
}
