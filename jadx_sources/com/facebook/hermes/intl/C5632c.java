package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import androidx.annotation.RequiresApi;
import p359j5.C40275d;
import p359j5.C40278g;
import p359j5.InterfaceC40273b;

/* JADX INFO: renamed from: com.facebook.hermes.intl.c */
/* JADX INFO: compiled from: PlatformCollatorICU.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5632c implements IPlatformCollator {

    /* JADX INFO: renamed from: a */
    public RuleBasedCollator f8785a = null;

    /* JADX INFO: renamed from: com.facebook.hermes.intl.c$a */
    /* JADX INFO: compiled from: PlatformCollatorICU.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8786a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f8787b;

        static {
            int[] iArr = new int[IPlatformCollator.CaseFirst.values().length];
            f8787b = iArr;
            try {
                iArr[IPlatformCollator.CaseFirst.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8787b[IPlatformCollator.CaseFirst.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8787b[IPlatformCollator.CaseFirst.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IPlatformCollator.Sensitivity.values().length];
            f8786a = iArr2;
            try {
                iArr2[IPlatformCollator.Sensitivity.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8786a[IPlatformCollator.Sensitivity.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8786a[IPlatformCollator.Sensitivity.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8786a[IPlatformCollator.Sensitivity.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: a */
    public int mo8976a(String str, String str2) {
        return this.f8785a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: b */
    public IPlatformCollator mo8977b(InterfaceC40273b<?> interfaceC40273b) throws JSRangeErrorException {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((C40278g) interfaceC40273b).getLocale());
        this.f8785a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public IPlatformCollator mo8978c(IPlatformCollator.Sensitivity sensitivity) {
        int i11 = a.f8786a[sensitivity.ordinal()];
        if (i11 == 1) {
            this.f8785a.setStrength(0);
            return this;
        }
        if (i11 == 2) {
            this.f8785a.setStrength(1);
            return this;
        }
        if (i11 == 3) {
            this.f8785a.setStrength(0);
            this.f8785a.setCaseLevel(true);
            return this;
        }
        if (i11 != 4) {
            return this;
        }
        this.f8785a.setStrength(2);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: d */
    public IPlatformCollator.Sensitivity mo8979d() {
        RuleBasedCollator ruleBasedCollator = this.f8785a;
        if (ruleBasedCollator == null) {
            return IPlatformCollator.Sensitivity.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f8785a.isCaseLevel() ? IPlatformCollator.Sensitivity.CASE : IPlatformCollator.Sensitivity.BASE;
        }
        return strength == 1 ? IPlatformCollator.Sensitivity.ACCENT : IPlatformCollator.Sensitivity.VARIANT;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: e */
    public IPlatformCollator mo8980e(boolean z11) {
        if (z11) {
            this.f8785a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: f */
    public IPlatformCollator mo8981f(IPlatformCollator.CaseFirst caseFirst) {
        int i11 = a.f8787b[caseFirst.ordinal()];
        if (i11 == 1) {
            this.f8785a.setUpperCaseFirst(true);
            return this;
        }
        if (i11 != 2) {
            this.f8785a.setCaseFirstDefault();
            return this;
        }
        this.f8785a.setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: g */
    public IPlatformCollator mo8982g(boolean z11) {
        if (z11) {
            this.f8785a.setNumericCollation(C40275d.m88674e(Boolean.TRUE));
        }
        return this;
    }
}
