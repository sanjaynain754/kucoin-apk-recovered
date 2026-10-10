package p600rl;

import android.content.Context;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.kubi.kucoin.utils.BottomLottieRequest;
import com.kubi.kucoin.utils.BottomLottieSource;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rl.b */
/* JADX INFO: compiled from: HomeRadioButton.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/main/widget/HomeLottieGateway;", "", "requestComposition", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "context", "Landroid/content/Context;", "assetName", "", "onSuccess", "Lkotlin/Function2;", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "", "onFailure", "Lkotlin/Function1;", "", "createDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "composition", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44113b {
    @NotNull
    /* JADX INFO: renamed from: a */
    LottieDrawable mo97193a(@NotNull C5080h c5080h);

    @NotNull
    /* JADX INFO: renamed from: b */
    BottomLottieRequest mo97194b(@NotNull Context context, @NotNull String str, @NotNull Function2<? super C5080h, ? super BottomLottieSource, Unit> function2, @NotNull Function1<? super Throwable, Unit> function1);
}
