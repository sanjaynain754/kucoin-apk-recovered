package uk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import p599rk.C44109a;
import p599rk.C44110b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: uk.a */
/* JADX INFO: compiled from: InternalCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Luk/a;", "", "<init>", "()V", "Lrk/b;", "qty", "positionQty", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lrk/b;Lrk/b;)Lrk/b;", "", "isBuy", "isInverse", "b", "(ZZ)Lrk/b;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInternalCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/InternalCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,64:1\n52#2:65\n38#2,2:66\n55#2,2:68\n41#2:70\n38#2,2:71\n55#2,2:73\n41#2:75\n38#2,2:76\n55#2,2:78\n41#2:80\n38#2,2:81\n55#2,2:83\n41#2:85\n38#2,2:86\n55#2,2:88\n41#2:90\n38#2,2:91\n55#2,2:93\n41#2:95\n38#2,2:96\n55#2,2:98\n41#2:100\n38#2,2:101\n55#2,2:103\n41#2:105\n38#2,2:106\n55#2,2:108\n41#2:110\n38#2,2:111\n55#2,2:113\n41#2:115\n38#2,2:116\n55#2,2:118\n41#2:120\n38#2,2:121\n55#2,2:123\n41#2:125\n*S KotlinDebug\n*F\n+ 1 InternalCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/InternalCalculator\n*L\n26#1:65\n26#1:66,2\n26#1:68,2\n26#1:70\n26#1:71,2\n26#1:73,2\n26#1:75\n27#1:76,2\n27#1:78,2\n27#1:80\n27#1:81,2\n27#1:83,2\n27#1:85\n33#1:86,2\n33#1:88,2\n33#1:90\n33#1:91,2\n33#1:93,2\n33#1:95\n33#1:96,2\n33#1:98,2\n33#1:100\n33#1:101,2\n33#1:103,2\n33#1:105\n38#1:106,2\n38#1:108,2\n38#1:110\n38#1:111,2\n38#1:113,2\n38#1:115\n38#1:116,2\n38#1:118,2\n38#1:120\n38#1:121,2\n38#1:123,2\n38#1:125\n*E\n"})
public final class C45256a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45256a f101797a = new C45256a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C44110b m100031a(@NotNull C44110b qty, @NotNull C44110b positionQty) throws Throwable {
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        if (positionQty.m97182b(new C44110b("0")) == 0) {
            return qty;
        }
        C44110b c44110bM97181a = positionQty.m97181a(qty);
        C44109a c44109a = C44109a.f97401a;
        if (c44110bM97181a.m97182b(c44109a.m97180b()) < 0) {
            c44110bM97181a = c44110bM97181a.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
        }
        if (c44110bM97181a.m97182b(qty.m97182b(c44109a.m97180b()) >= 0 ? qty : qty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) > 0) {
            C44110b c44110bM97181a2 = qty.m97181a(positionQty);
            if (c44110bM97181a2.m97182b(c44109a.m97180b()) < 0) {
                c44110bM97181a2 = c44110bM97181a2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            if (c44110bM97181a2.m97182b(positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) > 0) {
                return qty;
            }
        }
        if ((positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(qty.m97182b(c44109a.m97180b()) >= 0 ? qty : qty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) >= 0) {
            C44110b c44110bM97181a3 = qty.m97181a(positionQty);
            if (c44110bM97181a3.m97182b(c44109a.m97180b()) < 0) {
                c44110bM97181a3 = c44110bM97181a3.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            if (c44110bM97181a3.m97182b(positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) <= 0) {
                return new C44110b("0");
            }
        }
        if ((positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(qty.m97182b(c44109a.m97180b()) >= 0 ? qty : qty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) < 0) {
            C44110b c44110bM97181a4 = qty.m97181a(positionQty);
            if (c44110bM97181a4.m97182b(c44109a.m97180b()) < 0) {
                c44110bM97181a4 = c44110bM97181a4.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            if (c44110bM97181a4.m97182b(qty.m97182b(c44109a.m97180b()) >= 0 ? qty : qty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) < 0) {
                return qty.m97181a(positionQty);
            }
        }
        return new C44110b("0");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C44110b m100032b(boolean isBuy, boolean isInverse) throws Throwable {
        if (isInverse) {
            return isBuy ? new C44110b(OtcAd.KYC_NOT_PASS) : new C44110b("1");
        }
        return isBuy ? new C44110b("1") : new C44110b(OtcAd.KYC_NOT_PASS);
    }
}
