package com.sumsub.sns.internal.core.domain;

import android.content.Context;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.jumio.core.constants.ConstantsKt;
import com.squareup.picasso.C27831o;
import com.squareup.picasso.C27834r;
import com.squareup.picasso.Picasso;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.C27873H0;
import com.sumsub.sns.internal.core.analytics.C28378q;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28391E0;
import com.sumsub.sns.internal.core.common.C28446d0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28473m;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.data.network.C28516b;
import com.sumsub.sns.internal.core.data.network.interceptor.C28519a;
import com.sumsub.sns.internal.core.data.network.interceptor.C28523e;
import com.sumsub.sns.internal.core.data.network.interceptor.C28524f;
import com.sumsub.sns.internal.core.data.network.interceptor.C28528j;
import com.sumsub.sns.internal.core.data.network.interceptor.HttpLoggingInterceptor$Level;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.analytics.InterfaceC29904b;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29915K;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29918a;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29919b;
import com.sumsub.sns.internal.features.data.repository.cache.C29952b;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.esign.C29998a;
import com.sumsub.sns.internal.features.data.repository.esign.C29999b;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.features.data.repository.log.InterfaceC30001a;
import com.sumsub.sns.internal.features.data.repository.navigation.C30003A;
import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import com.sumsub.sns.internal.features.data.repository.navigation.InterfaceC30028w;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.data.repository.socket.C30050p;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30053b;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30055d;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30060i;
import com.sumsub.sns.internal.features.domain.C30216h;
import com.sumsub.sns.internal.features.domain.C30220j;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import com.sumsub.sns.internal.features.domain.fisherman.C30186j;
import com.sumsub.sns.internal.features.presentation.main.C31288j2;
import com.sumsub.sns.internal.fingerprint.AbstractC33063d;
import com.sumsub.sns.internal.fingerprint.C33062c;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.AbstractC33277e;
import com.sumsub.sns.internal.log.cacher.C33284l;
import com.sumsub.sns.internal.util.camera.C33394d;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import okhttp3.Cache;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import p717w8.C45753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.Regex;
import p852kotlin.text.RegexOption;
import p852kotlin.text.StringsKt;
import retrofit2.Retrofit;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28578h {

    /* JADX INFO: renamed from: T */
    public static C28578h f58143T;

    /* JADX INFO: renamed from: A */
    public final Lazy f58144A;

    /* JADX INFO: renamed from: B */
    public final Lazy f58145B;

    /* JADX INFO: renamed from: C */
    public final Lazy f58146C;

    /* JADX INFO: renamed from: D */
    public final Lazy f58147D;

    /* JADX INFO: renamed from: E */
    public final Lazy f58148E;

    /* JADX INFO: renamed from: F */
    public final Lazy f58149F;

    /* JADX INFO: renamed from: G */
    public final Lazy f58150G;

    /* JADX INFO: renamed from: H */
    public final Lazy f58151H;

    /* JADX INFO: renamed from: I */
    public final Lazy f58152I;

    /* JADX INFO: renamed from: J */
    public final Lazy f58153J;

    /* JADX INFO: renamed from: K */
    public final C28598r f58154K;

    /* JADX INFO: renamed from: L */
    public final C28576g f58155L;

    /* JADX INFO: renamed from: M */
    public final C28535a f58156M;

    /* JADX INFO: renamed from: N */
    public final C28544c f58157N;

    /* JADX INFO: renamed from: O */
    public final Lazy f58158O;

    /* JADX INFO: renamed from: P */
    public final Lazy f58159P;

    /* JADX INFO: renamed from: Q */
    public final Lazy f58160Q;

    /* JADX INFO: renamed from: R */
    public final Lazy f58161R;

    /* JADX INFO: renamed from: S */
    public final Lazy f58162S;

    /* JADX INFO: renamed from: a */
    public final Context f58163a;

    /* JADX INFO: renamed from: b */
    public final String f58164b;

    /* JADX INFO: renamed from: c */
    public final String f58165c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41709m0 f58166d;

    /* JADX INFO: renamed from: e */
    public final Lazy f58167e;

    /* JADX INFO: renamed from: f */
    public final Lazy f58168f;

    /* JADX INFO: renamed from: g */
    public final Lazy f58169g;

    /* JADX INFO: renamed from: h */
    public final Lazy f58170h;

    /* JADX INFO: renamed from: i */
    public final Lazy f58171i;

    /* JADX INFO: renamed from: j */
    public final Lazy f58172j;

    /* JADX INFO: renamed from: k */
    public final Lazy f58173k;

    /* JADX INFO: renamed from: l */
    public final Lazy f58174l;

    /* JADX INFO: renamed from: m */
    public final Lazy f58175m;

    /* JADX INFO: renamed from: n */
    public final Lazy f58176n;

    /* JADX INFO: renamed from: o */
    public final Lazy f58177o;

    /* JADX INFO: renamed from: p */
    public final Lazy f58178p;

    /* JADX INFO: renamed from: q */
    public final C28547d f58179q;

    /* JADX INFO: renamed from: r */
    public final Lazy f58180r;

    /* JADX INFO: renamed from: s */
    public final Lazy f58181s;

    /* JADX INFO: renamed from: t */
    public final Lazy f58182t;

    /* JADX INFO: renamed from: u */
    public final Lazy f58183u;

    /* JADX INFO: renamed from: v */
    public final Lazy f58184v;

    /* JADX INFO: renamed from: w */
    public final Lazy f58185w;

    /* JADX INFO: renamed from: x */
    public final Lazy f58186x;

    /* JADX INFO: renamed from: y */
    public final Lazy f58187y;

    /* JADX INFO: renamed from: z */
    public final AbstractC46162a f58188z;

    /* JADX INFO: renamed from: a */
    public static void m69435a(C28523e c28523e) {
        if (!C28468k0.f57988f) {
            c28523e.f58069k = HttpLoggingInterceptor$Level.NONE;
            return;
        }
        c28523e.f58069k = HttpLoggingInterceptor$Level.BODY;
        c28523e.f58066h.addAll(CollectionsKt.listOf("X-Access-Token"));
        c28523e.f58065g.addAll(CollectionsKt.listOf((Object[]) new String[]{InterfaceC33826o0.f71244p, "code", "idDocSetType"}));
        c28523e.f58067i.addAll(CollectionsKt.listOf((Object[]) new String[]{"accessToken", "applicant.info", "applicant.fixedInfo", "applicant.phone", "applicant.email", "applicant.ipCountry", "applicant.phoneCountry", "applicant.applicantPlatform", "applicant.questionnaires", "action.info", "action.fixedInfo", "action.phone", "action.email", "action.questionnaires", "geoIpCountry", "agreement.items[].ip", "metadata[].value", "requiredIdDocsStatus", "uploaded.country", "uploaded.idDocType", "requested.requests[].type", "requested.requests[].country", "idDoc.idDocType", "idDoc.country", "idDoc.firstName", "idDoc.firstNameEn", "idDoc.lastName", "idDoc.lastNameEn", "idDoc.issuedDate", "idDoc.validUntil", "idDoc.number", "idDoc.dob", "idDoc.mrzLine1", "idDoc.mrzLine2", "idDoc.mrzLine3", "idDoc.address", "documentsSelection.info", "documentsSelection.docsByStep", "nfcSessionInfo", "otp.code", "eid.resultToken", "oauth.completeUrl", "eidConfirmation.certificate"}));
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        c28523e.f58068j.addAll(CollectionsKt.listOf((Object[]) new Regex[]{new Regex("/resources/sdk/applicant/applicantData", regexOption), new Regex("/resources/sdk/applicantAction/applicantData", regexOption), new Regex("/resources/sdk/applicant/proofOfResidence/gps/address", regexOption), new Regex("/resources/applicants/.*/info/location", regexOption), new Regex("/resources/applicants/.*/identifierConfirmation/-/request", regexOption), new Regex("/resources/applicantActions/.*/identifierConfirmation/-/request", regexOption), new Regex("/resources/applicants/.*/identifierConfirmation/.*/verify", regexOption), new Regex("/resources/applicantActions/.*/identifierConfirmation/.*/verify", regexOption), new Regex("/resources/sdk/applicantAction/questionnaires", regexOption), new Regex("/resources/sdk/questionnaires", regexOption), new Regex("/resources/sdk/applicant/nfc", regexOption), new Regex("/profile/auth", regexOption), new Regex("/profile/oauthCode", regexOption), new Regex("/profile/reuse/preview", regexOption)}));
    }

    /* JADX INFO: renamed from: b */
    public static final C29914J m69437b(C28578h c28578h) {
        return new C29914J((InterfaceC29915K) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC29915K.class), (InterfaceC29919b) ((Retrofit) c28578h.f58150G.getValue()).create(InterfaceC29919b.class));
    }

    /* JADX INFO: renamed from: c */
    public static final C29950z m69440c(C28578h c28578h) {
        return new C29950z((InterfaceC29918a) c28578h.f58182t.getValue(), (C29999b) c28578h.f58183u.getValue(), (InterfaceC29984m) c28578h.f58180r.getValue());
    }

    /* JADX INFO: renamed from: d */
    public static final C31288j2 m69443d() {
        return new C31288j2();
    }

    /* JADX INFO: renamed from: e */
    public static final C29952b m69445e(C28578h c28578h) {
        return new C29952b(c28578h.f58163a);
    }

    /* JADX INFO: renamed from: f */
    public static final OkHttpClient m69447f(C28578h c28578h) {
        return ((OkHttpClient) c28578h.f58145B.getValue()).newBuilder().cache(new Cache(new File(c28578h.f58163a.getCacheDir(), "sumsub_cache"), 31457280L)).build();
    }

    /* JADX INFO: renamed from: g */
    public static final C30053b m69448g() {
        return new C30053b();
    }

    /* JADX INFO: renamed from: h */
    public static final C29957e m69450h(C28578h c28578h) {
        return new C29957e(c28578h.f58163a, (InterfaceC29954b) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC29954b.class));
    }

    /* JADX INFO: renamed from: A */
    public static final C30059h m69430A(C28578h c28578h) {
        return new C30059h((C30055d) c28578h.f58185w.getValue(), (C30053b) c28578h.f58173k.getValue());
    }

    /* JADX INFO: renamed from: B */
    public static final C30050p m69431B(C28578h c28578h) {
        return new C30050p((OkHttpClient) c28578h.f58145B.getValue(), c28578h.f58165c, (InterfaceC29984m) c28578h.f58180r.getValue(), c28578h.f58166d, c28578h.f58154K);
    }

    /* JADX INFO: renamed from: d */
    public static final C29917M m69442d(C28578h c28578h) {
        return new C29917M((InterfaceC29918a) c28578h.f58182t.getValue());
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC28389D0 m69444e() {
        C28391E0 c28391e0 = new C28391E0();
        try {
            Class.forName("com.google.mlkit.vision.face.FaceDetection");
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(c28391e0), "Using MLKit Face rotation detector", null, 4, null);
            return new C28446d0();
        } catch (Exception unused) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(c28391e0), "Disable rotation detector", null, 4, null);
            return new C28473m();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C33394d m69449g(C28578h c28578h) {
        return new C33394d(c28578h.f58163a);
    }

    /* JADX INFO: renamed from: i */
    public static final C30216h m69452i(C28578h c28578h) {
        return new C30216h((InterfaceC29984m) c28578h.f58180r.getValue(), (C30220j) c28578h.f58159P.getValue(), (C30312t) c28578h.f58158O.getValue());
    }

    /* JADX INFO: renamed from: j */
    public static final C30220j m69453j(C28578h c28578h) {
        return new C30220j((InterfaceC29984m) c28578h.f58180r.getValue());
    }

    /* JADX INFO: renamed from: k */
    public static final C29967J m69454k(C28578h c28578h) {
        return new C29967J((InterfaceC29954b) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC29954b.class), c28578h.f58166d, C41782z0.m91392b(), c28578h.f58154K, c28578h.f58155L);
    }

    /* JADX INFO: renamed from: l */
    public static final C30312t m69455l(C28578h c28578h) {
        return new C30312t((InterfaceC29984m) c28578h.f58180r.getValue(), (C30220j) c28578h.f58159P.getValue());
    }

    /* JADX INFO: renamed from: m */
    public static final C29999b m69456m(C28578h c28578h) {
        C29998a c29998a = (C29998a) c28578h.f58184v.getValue();
        InterfaceC29915K interfaceC29915K = (InterfaceC29915K) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC29915K.class);
        c29998a.getClass();
        return new C29999b(interfaceC29915K);
    }

    /* JADX INFO: renamed from: n */
    public static final Picasso m69457n(final C28578h c28578h) {
        return new Picasso.C27813b(c28578h.f58163a).m68802c(new Picasso.InterfaceC27815d() { // from class: com.sumsub.sns.internal.core.domain.u0
            @Override // com.squareup.picasso.Picasso.InterfaceC27815d
            /* JADX INFO: renamed from: a */
            public final void mo68804a(Picasso picasso, Uri uri, Exception exc) {
                C28578h.m69434a(picasso, uri, exc);
            }
        }).m68801b(new C27831o((OkHttpClient) c28578h.f58146C.getValue())).m68803d(new Picasso.InterfaceC27816e() { // from class: com.sumsub.sns.internal.core.domain.v0
            @Override // com.squareup.picasso.Picasso.InterfaceC27816e
            /* JADX INFO: renamed from: a */
            public final C27834r mo68805a(C27834r c27834r) {
                return C28578h.m69432a(this.f58223b, c27834r);
            }
        }).m68800a();
    }

    /* JADX INFO: renamed from: o */
    public static final C33062c m69458o(C28578h c28578h) {
        return AbstractC33063d.m71449h(c28578h.f58163a);
    }

    /* JADX INFO: renamed from: p */
    public static final C30182f m69459p(C28578h c28578h) {
        return new C30182f(c28578h.f58163a, c28578h.f58165c, c28578h.f58154K, new C30186j(c28578h.f58188z));
    }

    /* JADX INFO: renamed from: q */
    public static final C30002b m69460q(C28578h c28578h) {
        return new C30002b((InterfaceC30001a) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC30001a.class));
    }

    /* JADX INFO: renamed from: r */
    public static final OkHttpClient m69461r(C28578h c28578h) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient.Builder builderCallTimeout = builder.callTimeout(5L, timeUnit);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builderCallTimeout.connectTimeout(30L, timeUnit2).readTimeout(30L, timeUnit2).writeTimeout(1L, timeUnit).pingInterval(20L, timeUnit2).addInterceptor(new C28519a((C30034c) c28578h.f58167e.getValue(), c28578h.f58156M)).addInterceptor(new C28528j(c28578h.f58154K, c28578h.f58155L));
        List listEmptyList = CollectionsKt.emptyList();
        MediaType.Companion companion = MediaType.INSTANCE;
        C28523e c28523e = new C28523e(null, null, listEmptyList, CollectionsKt.listOf((Object[]) new MediaType[]{companion.get("image/*"), companion.get("video/*"), companion.get("audio/*"), companion.get(ConstantsKt.MIME_TYPE_PDF), companion.get(ShareTarget.ENCODING_TYPE_MULTIPART)}), null, 51);
        m69435a(c28523e);
        return builderAddInterceptor.addInterceptor(c28523e).build();
    }

    /* JADX INFO: renamed from: s */
    public static final OkHttpClient m69462s(C28578h c28578h) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).pingInterval(20L, timeUnit).addInterceptor(new C28519a((C30034c) c28578h.f58167e.getValue(), c28578h.f58156M)).addInterceptor(new C28524f((C30053b) c28578h.f58173k.getValue())).addInterceptor(new C28528j(c28578h.f58154K, c28578h.f58155L));
        C28523e c28523e = new C28523e(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.listOf(MediaType.INSTANCE.get(ConstantsKt.MIME_TYPE_OCTET_STREAM)), null, 48);
        m69435a(c28523e);
        return builderAddInterceptor.addInterceptor(c28523e).build();
    }

    /* JADX INFO: renamed from: t */
    public static final Picasso m69463t(final C28578h c28578h) {
        return new Picasso.C27813b(c28578h.f58163a).m68802c(new Picasso.InterfaceC27815d() { // from class: com.sumsub.sns.internal.core.domain.w0
            @Override // com.squareup.picasso.Picasso.InterfaceC27815d
            /* JADX INFO: renamed from: a */
            public final void mo68804a(Picasso picasso, Uri uri, Exception exc) {
                C28578h.m69439b(picasso, uri, exc);
            }
        }).m68801b(new C27831o((OkHttpClient) c28578h.f58145B.getValue())).m68803d(new Picasso.InterfaceC27816e() { // from class: com.sumsub.sns.internal.core.domain.x0
            @Override // com.squareup.picasso.Picasso.InterfaceC27816e
            /* JADX INFO: renamed from: a */
            public final C27834r mo68805a(C27834r c27834r) {
                return C28578h.m69436b(this.f58225b, c27834r);
            }
        }).m68800a();
    }

    /* JADX INFO: renamed from: u */
    public static final Retrofit m69464u(C28578h c28578h) {
        return new Retrofit.Builder().baseUrl(c28578h.f58165c).client((OkHttpClient) c28578h.f58144A.getValue()).addCallAdapterFactory(new C28516b(new C28553f(c28578h))).addConverterFactory(C45753c.m101007a(c28578h.f58188z, MediaType.INSTANCE.get("application/json"))).build();
    }

    /* JADX INFO: renamed from: v */
    public static final Retrofit m69465v(C28578h c28578h) {
        return new Retrofit.Builder().baseUrl(c28578h.f58165c).client((OkHttpClient) c28578h.f58145B.getValue()).addCallAdapterFactory(new C28516b(new C28550e(c28578h))).addConverterFactory(C45753c.m101007a(c28578h.f58188z, MediaType.INSTANCE.get("application/json"))).build();
    }

    /* JADX INFO: renamed from: w */
    public static final C33284l m69466w(C28578h c28578h) {
        C33284l c33284l = new C33284l("SentrySink", new C27873H0(), c28578h.f58163a.getCacheDir(), 12);
        AbstractC33277e.f67822b.add(c33284l);
        return c33284l;
    }

    /* JADX INFO: renamed from: x */
    public static final C30027v m69467x(C28578h c28578h) {
        return new C30027v((InterfaceC30028w) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC30028w.class), new C30003A());
    }

    /* JADX INFO: renamed from: y */
    public static final C30034c m69468y(C28578h c28578h) {
        return new C30034c(c28578h.f58157N, c28578h.f58163a.getSharedPreferences("idensic_mobile_sdk", 0));
    }

    /* JADX INFO: renamed from: z */
    public static final C30055d m69469z(C28578h c28578h) {
        return new C30055d((InterfaceC30060i) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC30060i.class));
    }

    public C28578h(Context context, String str, String str2, String str3) {
        this.f58163a = context;
        this.f58164b = str;
        this.f58165c = str2;
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41727q2.m91192b(null, 1, null));
        this.f58166d = interfaceC41709m0M91125a;
        this.f58167e = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69468y(this.f58217b);
            }
        });
        this.f58168f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69450h(this.f58221b);
            }
        });
        this.f58169g = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69440c(this.f58142b);
            }
        });
        this.f58170h = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69467x(this.f58200b);
            }
        });
        this.f58171i = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69443d();
            }
        });
        this.f58172j = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69442d(this.f58208b);
            }
        });
        this.f58173k = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69448g();
            }
        });
        this.f58174l = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69430A(this.f58216b);
            }
        });
        this.f58175m = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69460q(this.f58218b);
            }
        });
        this.f58176n = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69433a(this.f58220b);
            }
        });
        this.f58177o = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69466w(this.f58100b);
            }
        });
        this.f58178p = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69445e(this.f58205b);
            }
        });
        this.f58179q = new C28547d(this);
        this.f58180r = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69454k(this.f58227b);
            }
        });
        this.f58181s = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69431B(this.f58229b);
            }
        });
        this.f58182t = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69437b(this.f58090b);
            }
        });
        this.f58183u = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69456m(this.f58095b);
            }
        });
        this.f58184v = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.c1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69438b();
            }
        });
        this.f58185w = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69469z(this.f58101b);
            }
        });
        this.f58186x = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69458o(this.f58104b);
            }
        });
        this.f58187y = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69449g(this.f58219b);
            }
        });
        this.f58188z = AbstractC28400J.m69286a(C28468k0.f57988f);
        this.f58144A = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69461r(this.f58222b);
            }
        });
        this.f58145B = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69462s(this.f58224b);
            }
        });
        this.f58146C = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69441c();
            }
        });
        this.f58147D = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69459p(this.f58226b);
            }
        });
        this.f58148E = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69447f(this.f58228b);
            }
        });
        this.f58149F = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69465v(this.f58089b);
            }
        });
        this.f58150G = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69464u(this.f58094b);
            }
        });
        this.f58151H = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69463t(this.f58098b);
            }
        });
        this.f58152I = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69457n(this.f58103b);
            }
        });
        this.f58153J = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69444e();
            }
        });
        C28598r c28598r = new C28598r(context, interfaceC41709m0M91125a);
        if (str3 != null) {
            c28598r.f58215c = str3;
            C41696j.m91104d(c28598r.f58214b, null, null, new C28596q(c28598r, str3, null), 3, null);
        }
        this.f58154K = c28598r;
        this.f58155L = new C28576g();
        this.f58156M = new C28535a(this);
        this.f58157N = new C28544c(this);
        this.f58158O = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69455l(this.f58189b);
            }
        });
        this.f58159P = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69453j(this.f58192b);
            }
        });
        this.f58160Q = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69452i(this.f58195b);
            }
        });
        this.f58161R = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69451h();
            }
        });
        this.f58162S = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.domain.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28578h.m69446f();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Map m69451h() {
        return new LinkedHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static final OkHttpClient m69441c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).build();
    }

    /* JADX INFO: renamed from: b */
    public static final C29998a m69438b() {
        return new C29998a();
    }

    /* JADX INFO: renamed from: b */
    public static final void m69439b(Picasso picasso, Uri uri, Exception exc) {
        C33272c.f67814c.mo68956e("Picasso", "Error", exc);
    }

    /* JADX INFO: renamed from: f */
    public static final Set m69446f() {
        return Collections.synchronizedSet(new LinkedHashSet());
    }

    /* JADX INFO: renamed from: b */
    public static final C27834r m69436b(C28578h c28578h, C27834r c27834r) {
        return new C27834r.b(Uri.parse(c28578h.f58165c + c27834r.f56803d)).m68898a();
    }

    /* JADX INFO: renamed from: a */
    public static final C29903a m69433a(C28578h c28578h) {
        C33284l c33284l = new C33284l("AnalyticsRepository", new C28378q((InterfaceC29904b) ((Retrofit) c28578h.f58149F.getValue()).create(InterfaceC29904b.class)), c28578h.f58163a.getCacheDir(), 28);
        AbstractC33277e.f67822b.add(c33284l);
        return new C29903a(c33284l);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    public static final C27834r m69432a(C28578h c28578h, C27834r c27834r) {
        String str;
        C29124h c29124hM70039a = ((C29967J) ((InterfaceC29984m) c28578h.f58180r.getValue())).m70039a();
        if (c29124hM70039a != null && (str = c29124hM70039a.f59090w) != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                str = "https://static.sumsub.com";
            }
        } else {
            str = "https://static.sumsub.com";
        }
        return new C27834r.b(Uri.parse(str + c27834r.f56803d)).m68898a();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69434a(Picasso picasso, Uri uri, Exception exc) {
        C33272c.f67814c.mo68956e("Picasso", "External image load error", exc);
    }

    /* JADX INFO: renamed from: a */
    public final void m69470a() {
        JobKt__JobKt.m90365i(this.f58166d.getCoroutineContext(), null, 1, null);
    }
}
