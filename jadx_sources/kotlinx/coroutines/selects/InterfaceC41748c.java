package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.c */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/selects/c;", "R", "", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/f;", "Lkotlin/Function2;", "g", "(Lkotlinx/coroutines/selects/f;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41748c<R> {
    /* JADX INFO: renamed from: a */
    void mo91275a(@NotNull InterfaceC41749d interfaceC41749d, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    /* JADX INFO: renamed from: g */
    <Q> void mo91279g(@NotNull InterfaceC41751f<? extends Q> interfaceC41751f, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}
