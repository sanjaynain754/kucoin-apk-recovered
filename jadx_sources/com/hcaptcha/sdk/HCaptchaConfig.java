package com.hcaptcha.sdk;

import com.fasterxml.jackson.annotation.InterfaceC6281l;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Locale;
import lombok.Generated;
import lombok.NonNull;

/* JADX INFO: loaded from: classes56.dex */
public class HCaptchaConfig implements Serializable {

    @InterfaceC6281l
    @Deprecated
    private String apiEndpoint;
    private String assethost;
    private String customTheme;
    private Boolean diagnosticLog;

    @NonNull
    private Boolean disableHardwareAcceleration;
    private String endpoint;
    private Boolean hideDialog;
    private String host;
    private String imghost;
    private String jsSrc;
    private Boolean loading;
    private String locale;
    private HCaptchaOrientation orientation;
    private String reportapi;

    @Deprecated
    private Boolean resetOnTimeout;

    @InterfaceC6281l
    private IHCaptchaRetryPredicate retryPredicate;

    @Deprecated
    private String rqdata;
    private Boolean sentry;

    @NonNull
    private String siteKey;
    private HCaptchaSize size;
    private HCaptchaTheme theme;
    private long tokenExpiration;

    /* JADX INFO: renamed from: com.hcaptcha.sdk.HCaptchaConfig$a */
    public static class C9169a {

        /* JADX INFO: renamed from: A */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12818A;

        /* JADX INFO: renamed from: B */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12819B;

        /* JADX INFO: renamed from: C */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12820C;

        /* JADX INFO: renamed from: D */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12821D;

        /* JADX INFO: renamed from: E */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12822E;

        /* JADX INFO: renamed from: F */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public IHCaptchaRetryPredicate f12823F;

        /* JADX INFO: renamed from: G */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12824G;

        /* JADX INFO: renamed from: H */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public long f12825H;

        /* JADX INFO: renamed from: I */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12826I;

        /* JADX INFO: renamed from: J */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12827J;

        /* JADX INFO: renamed from: K */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12828K;

        /* JADX INFO: renamed from: L */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12829L;

        /* JADX INFO: renamed from: a */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12830a;

        /* JADX INFO: renamed from: b */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12831b;

        /* JADX INFO: renamed from: c */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12832c;

        /* JADX INFO: renamed from: d */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12833d;

        /* JADX INFO: renamed from: e */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12834e;

        /* JADX INFO: renamed from: f */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12835f;

        /* JADX INFO: renamed from: g */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f12836g;

        /* JADX INFO: renamed from: h */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12837h;

        /* JADX INFO: renamed from: i */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12838i;

        /* JADX INFO: renamed from: j */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12839j;

        /* JADX INFO: renamed from: k */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12840k;

        /* JADX INFO: renamed from: l */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12841l;

        /* JADX INFO: renamed from: m */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12842m;

        /* JADX INFO: renamed from: n */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12843n;

        /* JADX INFO: renamed from: o */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12844o;

        /* JADX INFO: renamed from: p */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12845p;

        /* JADX INFO: renamed from: q */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12846q;

        /* JADX INFO: renamed from: r */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12847r;

        /* JADX INFO: renamed from: s */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12848s;

        /* JADX INFO: renamed from: t */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaSize f12849t;

        /* JADX INFO: renamed from: u */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12850u;

        /* JADX INFO: renamed from: v */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaOrientation f12851v;

        /* JADX INFO: renamed from: w */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12852w;

        /* JADX INFO: renamed from: x */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaTheme f12853x;

        /* JADX INFO: renamed from: y */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12854y;

        /* JADX INFO: renamed from: z */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12855z;

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: b */
        public C9169a m13912b(String str) {
            this.f12844o = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: c */
        public HCaptchaConfig m13913c() {
            Boolean bool$default$sentry = this.f12832c;
            if (!this.f12831b) {
                bool$default$sentry = HCaptchaConfig.$default$sentry();
            }
            Boolean bool = bool$default$sentry;
            Boolean bool$default$loading = this.f12834e;
            if (!this.f12833d) {
                bool$default$loading = HCaptchaConfig.$default$loading();
            }
            Boolean bool2 = bool$default$loading;
            Boolean bool$default$hideDialog = this.f12836g;
            if (!this.f12835f) {
                bool$default$hideDialog = HCaptchaConfig.$default$hideDialog();
            }
            Boolean bool3 = bool$default$hideDialog;
            String str$default$apiEndpoint = this.f12839j;
            if (!this.f12838i) {
                str$default$apiEndpoint = HCaptchaConfig.$default$apiEndpoint();
            }
            String str = str$default$apiEndpoint;
            String str$default$jsSrc = this.f12841l;
            if (!this.f12840k) {
                str$default$jsSrc = HCaptchaConfig.$default$jsSrc();
            }
            String str2 = str$default$jsSrc;
            String str$default$locale = this.f12847r;
            if (!this.f12846q) {
                str$default$locale = HCaptchaConfig.$default$locale();
            }
            String str3 = str$default$locale;
            HCaptchaSize hCaptchaSize$default$size = this.f12849t;
            if (!this.f12848s) {
                hCaptchaSize$default$size = HCaptchaConfig.$default$size();
            }
            HCaptchaSize hCaptchaSize = hCaptchaSize$default$size;
            HCaptchaOrientation hCaptchaOrientation$default$orientation = this.f12851v;
            if (!this.f12850u) {
                hCaptchaOrientation$default$orientation = HCaptchaConfig.$default$orientation();
            }
            HCaptchaOrientation hCaptchaOrientation = hCaptchaOrientation$default$orientation;
            HCaptchaTheme hCaptchaTheme$default$theme = this.f12853x;
            if (!this.f12852w) {
                hCaptchaTheme$default$theme = HCaptchaConfig.$default$theme();
            }
            HCaptchaTheme hCaptchaTheme = hCaptchaTheme$default$theme;
            String str$default$host = this.f12855z;
            if (!this.f12854y) {
                str$default$host = HCaptchaConfig.$default$host();
            }
            String str4 = str$default$host;
            String str$default$customTheme = this.f12819B;
            if (!this.f12818A) {
                str$default$customTheme = HCaptchaConfig.$default$customTheme();
            }
            String str5 = str$default$customTheme;
            Boolean bool$default$resetOnTimeout = this.f12821D;
            if (!this.f12820C) {
                bool$default$resetOnTimeout = HCaptchaConfig.$default$resetOnTimeout();
            }
            Boolean bool4 = bool$default$resetOnTimeout;
            IHCaptchaRetryPredicate iHCaptchaRetryPredicate$default$retryPredicate = this.f12823F;
            if (!this.f12822E) {
                iHCaptchaRetryPredicate$default$retryPredicate = HCaptchaConfig.$default$retryPredicate();
            }
            IHCaptchaRetryPredicate iHCaptchaRetryPredicate = iHCaptchaRetryPredicate$default$retryPredicate;
            long j$default$tokenExpiration = this.f12825H;
            if (!this.f12824G) {
                j$default$tokenExpiration = HCaptchaConfig.$default$tokenExpiration();
            }
            long j11 = j$default$tokenExpiration;
            Boolean bool$default$diagnosticLog = this.f12827J;
            if (!this.f12826I) {
                bool$default$diagnosticLog = HCaptchaConfig.$default$diagnosticLog();
            }
            Boolean bool5 = bool$default$diagnosticLog;
            Boolean bool$default$disableHardwareAcceleration = this.f12829L;
            if (!this.f12828K) {
                bool$default$disableHardwareAcceleration = HCaptchaConfig.$default$disableHardwareAcceleration();
            }
            return new HCaptchaConfig(this.f12830a, bool, bool2, bool3, this.f12837h, str, str2, this.f12842m, this.f12843n, this.f12844o, this.f12845p, str3, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str4, str5, bool4, iHCaptchaRetryPredicate, j11, bool5, bool$default$disableHardwareAcceleration);
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: d */
        public C9169a m13914d(String str) {
            this.f12819B = str;
            this.f12818A = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: e */
        public C9169a m13915e(Boolean bool) {
            this.f12827J = bool;
            this.f12826I = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: f */
        public C9169a m13916f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
            }
            this.f12829L = bool;
            this.f12828K = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: g */
        public C9169a m13917g(String str) {
            this.f12842m = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: h */
        public C9169a m13918h(Boolean bool) {
            this.f12836g = bool;
            this.f12835f = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C9169a m13919i(String str) {
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.isEmpty()) {
                    this.f12855z = null;
                } else {
                    if (strTrim.contains("://")) {
                        throw new IllegalArgumentException("Config 'host' must be a hostname, not a URL. Remove scheme from: '" + strTrim + "'");
                    }
                    this.f12855z = strTrim;
                }
            }
            this.f12854y = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: j */
        public C9169a m13920j(String str) {
            this.f12845p = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: k */
        public C9169a m13921k(String str) {
            this.f12841l = str;
            this.f12840k = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: l */
        public C9169a m13922l(Boolean bool) {
            this.f12834e = bool;
            this.f12833d = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: m */
        public C9169a m13923m(String str) {
            this.f12847r = str;
            this.f12846q = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: n */
        public C9169a m13924n(HCaptchaOrientation hCaptchaOrientation) {
            this.f12851v = hCaptchaOrientation;
            this.f12850u = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: o */
        public C9169a m13925o(String str) {
            this.f12843n = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        @Deprecated
        /* JADX INFO: renamed from: p */
        public C9169a m13926p(Boolean bool) {
            this.f12821D = bool;
            this.f12820C = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        @InterfaceC6281l
        /* JADX INFO: renamed from: q */
        public C9169a m13927q(IHCaptchaRetryPredicate iHCaptchaRetryPredicate) {
            this.f12823F = iHCaptchaRetryPredicate;
            this.f12822E = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        @Deprecated
        /* JADX INFO: renamed from: r */
        public C9169a m13928r(String str) {
            this.f12837h = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: s */
        public C9169a m13929s(Boolean bool) {
            this.f12832c = bool;
            this.f12831b = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: t */
        public C9169a m13930t(@NonNull String str) {
            if (str == null) {
                throw new NullPointerException("siteKey is marked non-null but is null");
            }
            this.f12830a = str;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "HCaptchaConfig.HCaptchaConfigBuilder(siteKey=" + this.f12830a + ", sentry$value=" + this.f12832c + ", loading$value=" + this.f12834e + ", hideDialog$value=" + this.f12836g + ", rqdata=" + this.f12837h + ", apiEndpoint$value=" + this.f12839j + ", jsSrc$value=" + this.f12841l + ", endpoint=" + this.f12842m + ", reportapi=" + this.f12843n + ", assethost=" + this.f12844o + ", imghost=" + this.f12845p + ", locale$value=" + this.f12847r + ", size$value=" + this.f12849t + ", orientation$value=" + this.f12851v + ", theme$value=" + this.f12853x + ", host$value=" + this.f12855z + ", customTheme$value=" + this.f12819B + ", resetOnTimeout$value=" + this.f12821D + ", retryPredicate$value=" + this.f12823F + ", tokenExpiration$value=" + this.f12825H + ", diagnosticLog$value=" + this.f12827J + ", disableHardwareAcceleration$value=" + this.f12829L + ")";
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: u */
        public C9169a m13931u(HCaptchaSize hCaptchaSize) {
            this.f12849t = hCaptchaSize;
            this.f12848s = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: v */
        public C9169a m13932v(HCaptchaTheme hCaptchaTheme) {
            this.f12853x = hCaptchaTheme;
            this.f12852w = true;
            return this;
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: w */
        public C9169a m13933w(long j11) {
            this.f12825H = j11;
            this.f12824G = true;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public C9169a() {
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public C9169a m13911a(String str) {
            m13921k(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$customTheme() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$host() {
        return null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaConfig(@NonNull String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str10, String str11, Boolean bool4, IHCaptchaRetryPredicate iHCaptchaRetryPredicate, long j11, Boolean bool5, @NonNull Boolean bool6) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        if (bool6 == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.siteKey = str;
        this.sentry = bool;
        this.loading = bool2;
        this.hideDialog = bool3;
        this.rqdata = str2;
        this.apiEndpoint = str3;
        this.jsSrc = str4;
        this.endpoint = str5;
        this.reportapi = str6;
        this.assethost = str7;
        this.imghost = str8;
        this.locale = str9;
        this.size = hCaptchaSize;
        this.orientation = hCaptchaOrientation;
        this.theme = hCaptchaTheme;
        this.host = str10;
        this.customTheme = str11;
        this.resetOnTimeout = bool4;
        this.retryPredicate = iHCaptchaRetryPredicate;
        this.tokenExpiration = j11;
        this.diagnosticLog = bool5;
        this.disableHardwareAcceleration = bool6;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
        if (!hCaptchaConfig.canEqual(this) || getTokenExpiration() != hCaptchaConfig.getTokenExpiration()) {
            return false;
        }
        Boolean sentry = getSentry();
        Boolean sentry2 = hCaptchaConfig.getSentry();
        if (sentry != null ? !sentry.equals(sentry2) : sentry2 != null) {
            return false;
        }
        Boolean loading = getLoading();
        Boolean loading2 = hCaptchaConfig.getLoading();
        if (loading != null ? !loading.equals(loading2) : loading2 != null) {
            return false;
        }
        Boolean hideDialog = getHideDialog();
        Boolean hideDialog2 = hCaptchaConfig.getHideDialog();
        if (hideDialog != null ? !hideDialog.equals(hideDialog2) : hideDialog2 != null) {
            return false;
        }
        Boolean resetOnTimeout = getResetOnTimeout();
        Boolean resetOnTimeout2 = hCaptchaConfig.getResetOnTimeout();
        if (resetOnTimeout != null ? !resetOnTimeout.equals(resetOnTimeout2) : resetOnTimeout2 != null) {
            return false;
        }
        Boolean diagnosticLog = getDiagnosticLog();
        Boolean diagnosticLog2 = hCaptchaConfig.getDiagnosticLog();
        if (diagnosticLog != null ? !diagnosticLog.equals(diagnosticLog2) : diagnosticLog2 != null) {
            return false;
        }
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        Boolean disableHardwareAcceleration2 = hCaptchaConfig.getDisableHardwareAcceleration();
        if (disableHardwareAcceleration != null ? !disableHardwareAcceleration.equals(disableHardwareAcceleration2) : disableHardwareAcceleration2 != null) {
            return false;
        }
        String siteKey = getSiteKey();
        String siteKey2 = hCaptchaConfig.getSiteKey();
        if (siteKey != null ? !siteKey.equals(siteKey2) : siteKey2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaConfig.getRqdata();
        if (rqdata != null ? !rqdata.equals(rqdata2) : rqdata2 != null) {
            return false;
        }
        String apiEndpoint = getApiEndpoint();
        String apiEndpoint2 = hCaptchaConfig.getApiEndpoint();
        if (apiEndpoint != null ? !apiEndpoint.equals(apiEndpoint2) : apiEndpoint2 != null) {
            return false;
        }
        String jsSrc = getJsSrc();
        String jsSrc2 = hCaptchaConfig.getJsSrc();
        if (jsSrc != null ? !jsSrc.equals(jsSrc2) : jsSrc2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = hCaptchaConfig.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String reportapi = getReportapi();
        String reportapi2 = hCaptchaConfig.getReportapi();
        if (reportapi != null ? !reportapi.equals(reportapi2) : reportapi2 != null) {
            return false;
        }
        String assethost = getAssethost();
        String assethost2 = hCaptchaConfig.getAssethost();
        if (assethost != null ? !assethost.equals(assethost2) : assethost2 != null) {
            return false;
        }
        String imghost = getImghost();
        String imghost2 = hCaptchaConfig.getImghost();
        if (imghost != null ? !imghost.equals(imghost2) : imghost2 != null) {
            return false;
        }
        String locale = getLocale();
        String locale2 = hCaptchaConfig.getLocale();
        if (locale != null ? !locale.equals(locale2) : locale2 != null) {
            return false;
        }
        HCaptchaSize size = getSize();
        HCaptchaSize size2 = hCaptchaConfig.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        HCaptchaOrientation orientation = getOrientation();
        HCaptchaOrientation orientation2 = hCaptchaConfig.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        HCaptchaTheme theme = getTheme();
        HCaptchaTheme theme2 = hCaptchaConfig.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = hCaptchaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String customTheme = getCustomTheme();
        String customTheme2 = hCaptchaConfig.getCustomTheme();
        if (customTheme != null ? !customTheme.equals(customTheme2) : customTheme2 != null) {
            return false;
        }
        IHCaptchaRetryPredicate retryPredicate = getRetryPredicate();
        IHCaptchaRetryPredicate retryPredicate2 = hCaptchaConfig.getRetryPredicate();
        return retryPredicate != null ? retryPredicate.equals(retryPredicate2) : retryPredicate2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$apiEndpoint() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$diagnosticLog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$disableHardwareAcceleration() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$hideDialog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$jsSrc() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$loading() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaOrientation $default$orientation() {
        return HCaptchaOrientation.PORTRAIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$resetOnTimeout() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static IHCaptchaRetryPredicate $default$retryPredicate() {
        return new C9175c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$sentry() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaSize $default$size() {
        return HCaptchaSize.INVISIBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaTheme $default$theme() {
        return HCaptchaTheme.LIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static long $default$tokenExpiration() {
        return 120L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13910a(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        return Boolean.TRUE.equals(hCaptchaConfig.resetOnTimeout) && hCaptchaException.getHCaptchaError() == HCaptchaError.SESSION_TIMEOUT;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static C9169a builder() {
        return new C9169a();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj) {
        return obj instanceof HCaptchaConfig;
    }

    @Deprecated
    public String getApiEndpoint() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getAssethost() {
        return this.assethost;
    }

    @InterfaceC6281l
    public String getBaseUrl() {
        String str = this.host;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return "https://".concat(str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomTheme() {
        return this.customTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDiagnosticLog() {
        return this.diagnosticLog;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getHideDialog() {
        return this.hideDialog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getHost() {
        return this.host;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getImghost() {
        return this.imghost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getJsSrc() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getLoading() {
        return this.loading;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getLocale() {
        return this.locale;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaOrientation getOrientation() {
        return this.orientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getReportapi() {
        return this.reportapi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public Boolean getResetOnTimeout() {
        return this.resetOnTimeout;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public IHCaptchaRetryPredicate getRetryPredicate() {
        return this.retryPredicate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public String getRqdata() {
        return this.rqdata;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getSentry() {
        return this.sentry;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSiteKey() {
        return this.siteKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaSize getSize() {
        return this.size;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaTheme getTheme() {
        return this.theme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getTokenExpiration() {
        return this.tokenExpiration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @InterfaceC6281l
    @Deprecated
    public void setApiEndpoint(String str) {
        this.apiEndpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setAssethost(String str) {
        this.assethost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCustomTheme(String str) {
        this.customTheme = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiagnosticLog(Boolean bool) {
        this.diagnosticLog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDisableHardwareAcceleration(@NonNull Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.disableHardwareAcceleration = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHideDialog(Boolean bool) {
        this.hideDialog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHost(String str) {
        this.host = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setImghost(String str) {
        this.imghost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setJsSrc(String str) {
        this.jsSrc = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLoading(Boolean bool) {
        this.loading = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLocale(String str) {
        this.locale = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setOrientation(HCaptchaOrientation hCaptchaOrientation) {
        this.orientation = hCaptchaOrientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReportapi(String str) {
        this.reportapi = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setResetOnTimeout(Boolean bool) {
        this.resetOnTimeout = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @InterfaceC6281l
    public void setRetryPredicate(IHCaptchaRetryPredicate iHCaptchaRetryPredicate) {
        this.retryPredicate = iHCaptchaRetryPredicate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setRqdata(String str) {
        this.rqdata = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSentry(Boolean bool) {
        this.sentry = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSiteKey(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSize(HCaptchaSize hCaptchaSize) {
        this.size = hCaptchaSize;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTheme(HCaptchaTheme hCaptchaTheme) {
        this.theme = hCaptchaTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTokenExpiration(long j11) {
        this.tokenExpiration = j11;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public C9169a toBuilder() {
        return new C9169a().m13930t(this.siteKey).m13929s(this.sentry).m13922l(this.loading).m13918h(this.hideDialog).m13928r(this.rqdata).m13911a(this.apiEndpoint).m13921k(this.jsSrc).m13917g(this.endpoint).m13925o(this.reportapi).m13912b(this.assethost).m13920j(this.imghost).m13923m(this.locale).m13931u(this.size).m13924n(this.orientation).m13932v(this.theme).m13919i(this.host).m13914d(this.customTheme).m13926p(this.resetOnTimeout).m13927q(this.retryPredicate).m13933w(this.tokenExpiration).m13915e(this.diagnosticLog).m13916f(this.disableHardwareAcceleration);
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaConfig(siteKey=" + getSiteKey() + ", sentry=" + getSentry() + ", loading=" + getLoading() + ", hideDialog=" + getHideDialog() + ", rqdata=" + getRqdata() + ", apiEndpoint=" + getApiEndpoint() + ", jsSrc=" + getJsSrc() + ", endpoint=" + getEndpoint() + ", reportapi=" + getReportapi() + ", assethost=" + getAssethost() + ", imghost=" + getImghost() + ", locale=" + getLocale() + ", size=" + getSize() + ", orientation=" + getOrientation() + ", theme=" + getTheme() + ", host=" + getHost() + ", customTheme=" + getCustomTheme() + ", resetOnTimeout=" + getResetOnTimeout() + ", retryPredicate=" + getRetryPredicate() + ", tokenExpiration=" + getTokenExpiration() + ", diagnosticLog=" + getDiagnosticLog() + ", disableHardwareAcceleration=" + getDisableHardwareAcceleration() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$locale() {
        return Locale.getDefault().getLanguage();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10;
        int iHashCode11;
        int iHashCode12;
        int iHashCode13;
        int iHashCode14;
        int iHashCode15;
        int iHashCode16;
        int iHashCode17;
        int iHashCode18;
        int iHashCode19;
        int iHashCode20;
        long tokenExpiration = getTokenExpiration();
        Boolean sentry = getSentry();
        int i11 = (((int) (tokenExpiration ^ (tokenExpiration >>> 32))) + 59) * 59;
        int iHashCode21 = 43;
        if (sentry == null) {
            iHashCode = 43;
        } else {
            iHashCode = sentry.hashCode();
        }
        int i12 = i11 + iHashCode;
        Boolean loading = getLoading();
        int i13 = i12 * 59;
        if (loading == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = loading.hashCode();
        }
        int i14 = i13 + iHashCode2;
        Boolean hideDialog = getHideDialog();
        int i15 = i14 * 59;
        if (hideDialog == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = hideDialog.hashCode();
        }
        int i16 = i15 + iHashCode3;
        Boolean resetOnTimeout = getResetOnTimeout();
        int i17 = i16 * 59;
        if (resetOnTimeout == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = resetOnTimeout.hashCode();
        }
        int i18 = i17 + iHashCode4;
        Boolean diagnosticLog = getDiagnosticLog();
        int i19 = i18 * 59;
        if (diagnosticLog == null) {
            iHashCode5 = 43;
        } else {
            iHashCode5 = diagnosticLog.hashCode();
        }
        int i21 = i19 + iHashCode5;
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        int i22 = i21 * 59;
        if (disableHardwareAcceleration == null) {
            iHashCode6 = 43;
        } else {
            iHashCode6 = disableHardwareAcceleration.hashCode();
        }
        int i23 = i22 + iHashCode6;
        String siteKey = getSiteKey();
        int i24 = i23 * 59;
        if (siteKey == null) {
            iHashCode7 = 43;
        } else {
            iHashCode7 = siteKey.hashCode();
        }
        int i25 = i24 + iHashCode7;
        String rqdata = getRqdata();
        int i26 = i25 * 59;
        if (rqdata == null) {
            iHashCode8 = 43;
        } else {
            iHashCode8 = rqdata.hashCode();
        }
        int i27 = i26 + iHashCode8;
        String apiEndpoint = getApiEndpoint();
        int i28 = i27 * 59;
        if (apiEndpoint == null) {
            iHashCode9 = 43;
        } else {
            iHashCode9 = apiEndpoint.hashCode();
        }
        int i29 = i28 + iHashCode9;
        String jsSrc = getJsSrc();
        int i31 = i29 * 59;
        if (jsSrc == null) {
            iHashCode10 = 43;
        } else {
            iHashCode10 = jsSrc.hashCode();
        }
        int i32 = i31 + iHashCode10;
        String endpoint = getEndpoint();
        int i33 = i32 * 59;
        if (endpoint == null) {
            iHashCode11 = 43;
        } else {
            iHashCode11 = endpoint.hashCode();
        }
        int i34 = i33 + iHashCode11;
        String reportapi = getReportapi();
        int i35 = i34 * 59;
        if (reportapi == null) {
            iHashCode12 = 43;
        } else {
            iHashCode12 = reportapi.hashCode();
        }
        int i36 = i35 + iHashCode12;
        String assethost = getAssethost();
        int i37 = i36 * 59;
        if (assethost == null) {
            iHashCode13 = 43;
        } else {
            iHashCode13 = assethost.hashCode();
        }
        int i38 = i37 + iHashCode13;
        String imghost = getImghost();
        int i39 = i38 * 59;
        if (imghost == null) {
            iHashCode14 = 43;
        } else {
            iHashCode14 = imghost.hashCode();
        }
        int i41 = i39 + iHashCode14;
        String locale = getLocale();
        int i42 = i41 * 59;
        if (locale == null) {
            iHashCode15 = 43;
        } else {
            iHashCode15 = locale.hashCode();
        }
        int i43 = i42 + iHashCode15;
        HCaptchaSize size = getSize();
        int i44 = i43 * 59;
        if (size == null) {
            iHashCode16 = 43;
        } else {
            iHashCode16 = size.hashCode();
        }
        int i45 = i44 + iHashCode16;
        HCaptchaOrientation orientation = getOrientation();
        int i46 = i45 * 59;
        if (orientation == null) {
            iHashCode17 = 43;
        } else {
            iHashCode17 = orientation.hashCode();
        }
        int i47 = i46 + iHashCode17;
        HCaptchaTheme theme = getTheme();
        int i48 = i47 * 59;
        if (theme == null) {
            iHashCode18 = 43;
        } else {
            iHashCode18 = theme.hashCode();
        }
        int i49 = i48 + iHashCode18;
        String host = getHost();
        int i51 = i49 * 59;
        if (host == null) {
            iHashCode19 = 43;
        } else {
            iHashCode19 = host.hashCode();
        }
        int i52 = i51 + iHashCode19;
        String customTheme = getCustomTheme();
        int i53 = i52 * 59;
        if (customTheme == null) {
            iHashCode20 = 43;
        } else {
            iHashCode20 = customTheme.hashCode();
        }
        int i54 = i53 + iHashCode20;
        IHCaptchaRetryPredicate retryPredicate = getRetryPredicate();
        int i55 = i54 * 59;
        if (retryPredicate != null) {
            iHashCode21 = retryPredicate.hashCode();
        }
        return i55 + iHashCode21;
    }
}
