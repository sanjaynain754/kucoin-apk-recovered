package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.b */
/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, m90084d2 = {"R", "Lkotlinx/coroutines/selects/c;", "", "timeMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/selects/c;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/Duration;", "timeout", "b", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41747b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <R> void m91297a(@NotNull InterfaceC41748c<? super R> interfaceC41748c, long j11, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        interfaceC41748c.mo91275a(new OnTimeout(j11).m91265c(), function1);
    }

    /* JADX INFO: renamed from: b */
    public static final <R> void m91298b(@NotNull InterfaceC41748c<? super R> interfaceC41748c, long j11, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        m91297a(interfaceC41748c, DelayKt.m90353e(j11), function1);
    }
}
