package com.facebook.hermes.intl;

import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p359j5.InterfaceC40273b;

/* JADX INFO: loaded from: classes34.dex */
public interface IPlatformCollator {

    public enum CaseFirst {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5621a.f8700c[ordinal()];
            if (i11 == 1) {
                return "upper";
            }
            if (i11 == 2) {
                return "lower";
            }
            if (i11 == 3) {
                return CredentialEntry.FALSE_STRING;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Sensitivity {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5621a.f8698a[ordinal()];
            if (i11 == 1) {
                return TtmlNode.RUBY_BASE;
            }
            if (i11 == 2) {
                return "accent";
            }
            if (i11 == 3) {
                return "case";
            }
            if (i11 == 4) {
                return "variant";
            }
            if (i11 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Usage {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = C5621a.f8699b[ordinal()];
            if (i11 == 1) {
                return "sort";
            }
            if (i11 == 2) {
                return FirebaseAnalytics.Event.SEARCH;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    int mo8976a(String str, String str2);

    /* JADX INFO: renamed from: b */
    IPlatformCollator mo8977b(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException;

    /* JADX INFO: renamed from: c */
    IPlatformCollator mo8978c(Sensitivity sensitivity);

    /* JADX INFO: renamed from: d */
    Sensitivity mo8979d();

    /* JADX INFO: renamed from: e */
    IPlatformCollator mo8980e(boolean z11);

    /* JADX INFO: renamed from: f */
    IPlatformCollator mo8981f(CaseFirst caseFirst);

    /* JADX INFO: renamed from: g */
    IPlatformCollator mo8982g(boolean z11);

    /* JADX INFO: renamed from: com.facebook.hermes.intl.IPlatformCollator$a */
    public static /* synthetic */ class C5621a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8698a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f8699b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f8700c;

        static {
            int[] iArr = new int[CaseFirst.values().length];
            f8700c = iArr;
            try {
                iArr[CaseFirst.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8700c[CaseFirst.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8700c[CaseFirst.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Usage.values().length];
            f8699b = iArr2;
            try {
                iArr2[Usage.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8699b[Usage.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Sensitivity.values().length];
            f8698a = iArr3;
            try {
                iArr3[Sensitivity.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8698a[Sensitivity.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8698a[Sensitivity.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8698a[Sensitivity.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8698a[Sensitivity.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
