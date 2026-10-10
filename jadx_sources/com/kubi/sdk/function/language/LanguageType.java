package com.kubi.sdk.function.language;

import com.kubi.sdk.function.language.entity.LanguageEntity;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ENGLISH' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: LanguageType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010(\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/function/language/LanguageType;", "", "language", "", "locale", "Ljava/util/Locale;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Locale;)V", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "ENGLISH", "CHINA", "RU", "KOREA", "JA", "ES", "VN", "TR", "PT", "DE", "FR", "NL", "HONGKONG", "IN", "ITALY", "TH", "HI", "MS", "AR", "BN", "PL", "FIL", "UR", "UK", "getLocalString", "Companion", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LanguageType {

    /* JADX INFO: renamed from: AR */
    public static final LanguageType f46785AR;

    /* JADX INFO: renamed from: BN */
    public static final LanguageType f46786BN;
    public static final LanguageType CHINA;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: DE */
    public static final LanguageType f46787DE;
    public static final LanguageType ENGLISH;

    /* JADX INFO: renamed from: ES */
    public static final LanguageType f46788ES;
    public static final LanguageType FIL;

    /* JADX INFO: renamed from: FR */
    public static final LanguageType f46789FR;

    /* JADX INFO: renamed from: HI */
    public static final LanguageType f46790HI;
    public static final LanguageType HONGKONG;

    /* JADX INFO: renamed from: IN */
    public static final LanguageType f46791IN;
    public static final LanguageType ITALY;

    /* JADX INFO: renamed from: JA */
    public static final LanguageType f46792JA;
    public static final LanguageType KOREA;

    /* JADX INFO: renamed from: MS */
    public static final LanguageType f46793MS;

    /* JADX INFO: renamed from: NL */
    public static final LanguageType f46794NL;

    /* JADX INFO: renamed from: PL */
    public static final LanguageType f46795PL;

    /* JADX INFO: renamed from: PT */
    public static final LanguageType f46796PT;

    /* JADX INFO: renamed from: RU */
    public static final LanguageType f46797RU;

    /* JADX INFO: renamed from: TH */
    public static final LanguageType f46798TH;

    /* JADX INFO: renamed from: TR */
    public static final LanguageType f46799TR;

    /* JADX INFO: renamed from: UK */
    public static final LanguageType f46800UK;

    /* JADX INFO: renamed from: UR */
    public static final LanguageType f46801UR;

    /* JADX INFO: renamed from: VN */
    public static final LanguageType f46802VN;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ LanguageType[] f46803b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f46804c;

    @NotNull
    private String language;

    @NotNull
    private Locale locale;

    /* JADX INFO: compiled from: LanguageType.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0005J\f\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0006J\u0016\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0005¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/function/language/LanguageType$Companion;", "", "<init>", "()V", "toLanguageType", "Lcom/kubi/sdk/function/language/LanguageType;", "", "default", "toLanguageTypeOrNull", "Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLanguageType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageType.kt\ncom/kubi/sdk/function/language/LanguageType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LanguageType toLanguageType$default(Companion companion, String str, LanguageType languageType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                languageType = LanguageType.ENGLISH;
            }
            return companion.toLanguageType(str, languageType);
        }

        @NotNull
        public final LanguageType toLanguageType(@NotNull String str, @NotNull LanguageType languageType) {
            LanguageType next;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(languageType, "default");
            if (str.length() == 0) {
                return languageType;
            }
            Iterator<LanguageType> it = LanguageType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getLocalString(), str));
            LanguageType languageType2 = next;
            return languageType2 == null ? languageType : languageType2;
        }

        public Companion() {
        }

        public static /* synthetic */ LanguageType toLanguageType$default(Companion companion, LanguageEntity languageEntity, LanguageType languageType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                languageType = LanguageType.ENGLISH;
            }
            return companion.toLanguageType(languageEntity, languageType);
        }

        @Nullable
        public final LanguageType toLanguageTypeOrNull(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            LanguageType languageType = null;
            if (str.length() == 0) {
                return null;
            }
            for (LanguageType languageType2 : LanguageType.getEntries()) {
                if (Intrinsics.areEqual(languageType2.getLocalString(), str)) {
                    languageType = languageType2;
                    break;
                }
            }
            return languageType;
        }

        @NotNull
        public final LanguageType toLanguageType(@Nullable LanguageEntity languageEntity, @NotNull LanguageType languageType) {
            String type;
            LanguageType languageTypeOrNull;
            Intrinsics.checkNotNullParameter(languageType, "default");
            return (languageEntity == null || (type = languageEntity.getType()) == null || (languageTypeOrNull = toLanguageTypeOrNull(type)) == null) ? languageType : languageTypeOrNull;
        }
    }

    static {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        ENGLISH = new LanguageType("ENGLISH", 0, "English", US);
        Locale CHINA2 = Locale.CHINA;
        Intrinsics.checkNotNullExpressionValue(CHINA2, "CHINA");
        CHINA = new LanguageType("CHINA", 1, "中文简体", CHINA2);
        f46797RU = new LanguageType("RU", 2, "Pусский", new Locale("ru", "RU"));
        Locale KOREA2 = Locale.KOREA;
        Intrinsics.checkNotNullExpressionValue(KOREA2, "KOREA");
        KOREA = new LanguageType("KOREA", 3, "한국어", KOREA2);
        f46792JA = new LanguageType("JA", 4, "日本語", new Locale("ja", "JP"));
        f46788ES = new LanguageType("ES", 5, "Español", new Locale("es", "ES"));
        f46802VN = new LanguageType("VN", 6, "Tiếng Việt", new Locale("vi", "VN"));
        f46799TR = new LanguageType("TR", 7, "Türkçe", new Locale("tr", "TR"));
        f46796PT = new LanguageType("PT", 8, "Português", new Locale("pt", "PT"));
        f46787DE = new LanguageType("DE", 9, "Deutsch", new Locale("de", "DE"));
        f46789FR = new LanguageType("FR", 10, "Français", new Locale("fr", "FR"));
        f46794NL = new LanguageType("NL", 11, "Nederlands", new Locale("nl", "NL"));
        HONGKONG = new LanguageType("HONGKONG", 12, "中文繁體", new Locale(TUIThemeManager.LANGUAGE_ZH_CN, "HK"));
        f46791IN = new LanguageType("IN", 13, "Bahasa Indonesia", new Locale("in", "ID"));
        Locale ITALY2 = Locale.ITALY;
        Intrinsics.checkNotNullExpressionValue(ITALY2, "ITALY");
        ITALY = new LanguageType("ITALY", 14, "Italiano", ITALY2);
        f46798TH = new LanguageType("TH", 15, "ไทย", new Locale("th", "TH"));
        f46790HI = new LanguageType("HI", 16, "हिंदी", new Locale("hi", "IN"));
        f46793MS = new LanguageType("MS", 17, "Bahasa Melayu", new Locale("ms", "MY"));
        f46785AR = new LanguageType("AR", 18, "العربية", new Locale(TUIThemeManager.LANGUAGE_AR, "AE"));
        f46786BN = new LanguageType("BN", 19, "বাংলা", new Locale("bn", "BD"));
        f46795PL = new LanguageType("PL", 20, "Polski", new Locale("pl", "PL"));
        FIL = new LanguageType("FIL", 21, "Filipino", new Locale("fil", "PH"));
        f46801UR = new LanguageType("UR", 22, "اردو", new Locale("ur", "PK"));
        f46800UK = new LanguageType("UK", 23, "Українська", new Locale("uk", "UA"));
        LanguageType[] languageTypeArrM56977a = m56977a();
        f46803b = languageTypeArrM56977a;
        f46804c = EnumEntriesKt.enumEntries(languageTypeArrM56977a);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ LanguageType[] m56977a() {
        return new LanguageType[]{ENGLISH, CHINA, f46797RU, KOREA, f46792JA, f46788ES, f46802VN, f46799TR, f46796PT, f46787DE, f46789FR, f46794NL, HONGKONG, f46791IN, ITALY, f46798TH, f46790HI, f46793MS, f46785AR, f46786BN, f46795PL, FIL, f46801UR, f46800UK};
    }

    @NotNull
    public static EnumEntries<LanguageType> getEntries() {
        return f46804c;
    }

    public static LanguageType valueOf(String str) {
        return (LanguageType) Enum.valueOf(LanguageType.class, str);
    }

    public static LanguageType[] values() {
        return (LanguageType[]) f46803b.clone();
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLocalString() {
        return C46612b.f104366a.m102773b(this.locale);
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<set-?>");
        this.locale = locale;
    }

    public LanguageType(String str, int i11, String str2, Locale locale) {
        super(str, i11);
        this.language = str2;
        this.locale = locale;
    }
}
