package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.p018os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import androidx.core.os.C1708b;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p780y.C46357a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1aSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "", "Lcom/appsflyer/internal/AFe1sSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1kSDK;", "p2", "Lcom/appsflyer/internal/AFc1fSDK;", "p3", "Lcom/appsflyer/internal/AFg1pSDK;", "p4", "Lcom/appsflyer/internal/AFf1fSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1qSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1sSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFg1pSDK;Lcom/appsflyer/internal/AFf1fSDK;Lkotlin/jvm/functions/Function1;)V", "", "getCurrencyIso4217Code", "()J", "getRevenue", "()Lcom/appsflyer/internal/AFe1qSDK;", "getMonetizationNetwork", "()V", "", "AFAdRevenueData", "()Z", "areAllFieldsValid", "Ljava/util/concurrent/Executor;", "component1", "Lcom/appsflyer/internal/AFc1fSDK;", "component2", "Lcom/appsflyer/internal/AFe1sSDK;", "getMediationNetwork", "component4", "Lcom/appsflyer/internal/AFg1pSDK;", "component3", "Lcom/appsflyer/internal/AFc1kSDK;", "equals", "Lkotlin/jvm/functions/Function1;", "toString", "Lcom/appsflyer/internal/AFf1fSDK;"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRegisterTriggerTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,169:1\n215#2,2:170\n*S KotlinDebug\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n*L\n163#1:170,2\n*E\n"})
public final class AFe1aSDK extends AFe1mSDK<Unit> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public Executor getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    public AFc1fSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    public AFe1sSDK getMediationNetwork;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public AFc1kSDK AFAdRevenueData;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public AFg1pSDK getRevenue;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @NotNull
    public Function1<AFe1qSDK, Unit> component2;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @NotNull
    public AFf1fSDK areAllFieldsValid;

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AFa1tSDK implements OutcomeReceiver {
        private /* synthetic */ Ref.ObjectRef<AFe1qSDK> getCurrencyIso4217Code;
        private /* synthetic */ CountDownLatch getMonetizationNetwork;
        private /* synthetic */ AFe1aSDK getRevenue;

        public AFa1tSDK(Ref.ObjectRef<AFe1qSDK> objectRef, CountDownLatch countDownLatch, AFe1aSDK aFe1aSDK) {
            this.getCurrencyIso4217Code = objectRef;
            this.getMonetizationNetwork = countDownLatch;
            this.getRevenue = aFe1aSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFe1aSDK.getRevenue(exc);
            this.getMonetizationNetwork.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1qSDK] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.element = AFe1qSDK.SUCCESS;
            AFLogger.INSTANCE.mo5914d(AFh1ySDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getMonetizationNetwork.countDown();
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1qSDK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.appsflyer.internal.AFe1qSDK] */
    @Override // com.appsflyer.internal.AFe1mSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1qSDK getRevenue() {
        C46357a c46357a;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1qSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context != null && (c46357a = (C46357a) context.getSystemService(C46357a.class)) != null) {
                new AFj1eSDK(this.AFAdRevenueData, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1eSDK.AFAdRevenueData()).buildUpon();
                String strAreAllFieldsValid = this.AFAdRevenueData.areAllFieldsValid();
                if (strAreAllFieldsValid == null) {
                    strAreAllFieldsValid = "";
                }
                Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m90091to("event_name", this.getMediationNetwork.AFAdRevenueData), TuplesKt.m90091to("app_id", this.AFAdRevenueData.getMediationNetwork.getMonetizationNetwork.getPackageName()), TuplesKt.m90091to("app_version", this.AFAdRevenueData.m5954n_().versionName), TuplesKt.m90091to("sdk_version", AFc1kSDK.AFAdRevenueData()), TuplesKt.m90091to("api_version", AFc1kSDK.getCurrencyIso4217Code()), TuplesKt.m90091to("timestamp", String.valueOf(this.getRevenue.getMonetizationNetwork())), TuplesKt.m90091to("request_id", AFc1kSDK.getMonetizationNetwork()), TuplesKt.m90091to("gaid", strAreAllFieldsValid));
                String revenue = AFb1mSDK.getRevenue(this.AFAdRevenueData.getRevenue);
                if (revenue != null) {
                    mapMutableMapOf.put("appsflyer_id", revenue);
                }
                Long revenue2 = this.getRevenue.getRevenue();
                if (revenue2 != null) {
                    mapMutableMapOf.put("install_time", String.valueOf(revenue2.longValue()));
                }
                AFe1sSDK aFe1sSDK = this.getMediationNetwork;
                if (aFe1sSDK instanceof AFe1sSDK.AFa1vSDK) {
                    Float f11 = ((AFe1sSDK.AFa1vSDK) aFe1sSDK).getMonetizationNetwork;
                    if (f11 != null) {
                        mapMutableMapOf.put("event_revenue", String.valueOf(f11.floatValue()));
                    }
                    Integer num = ((AFe1sSDK.AFa1vSDK) this.getMediationNetwork).getRevenue;
                    if (num != null) {
                        mapMutableMapOf.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mapMutableMapOf.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                c46357a.m102230b(uriBuild, this.getCurrencyIso4217Code, C1708b.m2427a(new AFa1tSDK(objectRef, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            objectRef.element = AFe1qSDK.TIMEOUT;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.mo5915e(AFh1ySDK.PRIVACY_SANDBOX, "Error occurred: " + th2.getMessage(), th2, false, false, false, true);
        }
        return (AFe1qSDK) objectRef.element;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFe1aSDK(@NotNull AFe1sSDK aFe1sSDK, @NotNull Executor executor, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFg1pSDK aFg1pSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull Function1<? super AFe1qSDK, Unit> function1) {
        super(AFe1oSDK.REGISTER_TRIGGER, new AFe1oSDK[]{AFe1oSDK.RC_CDN, AFe1oSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1sSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFg1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getMediationNetwork = aFe1sSDK;
        this.getCurrencyIso4217Code = executor;
        this.AFAdRevenueData = aFc1kSDK;
        this.getMonetizationNetwork = aFc1fSDK;
        this.getRevenue = aFg1pSDK;
        this.areAllFieldsValid = aFf1fSDK;
        this.component2 = function1;
        if (aFe1sSDK instanceof AFe1sSDK.AFa1uSDK) {
            this.getMonetizationNetwork.add(AFe1oSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1sSDK.AFa1zSDK) {
            this.getRevenue.add(AFe1oSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1sSDK.AFa1vSDK) {
            this.getRevenue.add(AFe1oSDK.INAPP);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFe1qSDK aFe1qSDK = this.AFAdRevenueData;
        if (aFe1qSDK != null) {
            this.component2.invoke(aFe1qSDK);
        }
    }

    public static final /* synthetic */ void getRevenue(Throwable th2) {
        AFLogger.INSTANCE.mo5915e(AFh1ySDK.PRIVACY_SANDBOX, "Error occurred: " + th2.getMessage(), th2, false, false, false, true);
    }
}
