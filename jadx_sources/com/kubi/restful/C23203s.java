package com.kubi.restful;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.s */
/* JADX INFO: compiled from: RestfulReturnFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u00028\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/restful/s;", "Resp", "Return", "Lcom/kubi/restful/u;", "<init>", "()V", "Lcom/kubi/restful/b;", "call", "Ljava/lang/Class;", "resultType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/restful/b;Ljava/lang/Class;)Ljava/lang/Object;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23203s<Resp, Return> implements InterfaceC23205u<Resp, Return> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.restful.InterfaceC23205u
    /* JADX INFO: renamed from: a */
    public Return mo55679a(@NotNull InterfaceC23186b<Resp> call, @NotNull Class<?> resultType) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        if (Intrinsics.areEqual(resultType, Observable.class)) {
            return (Return) new C23201q((RestfulCall) call);
        }
        if (Intrinsics.areEqual(resultType, Flowable.class)) {
            return (Return) new C23201q((RestfulCall) call).toFlowable(BackpressureStrategy.LATEST);
        }
        if (Intrinsics.areEqual(resultType, Single.class)) {
            return (Return) new C23201q((RestfulCall) call).singleOrError();
        }
        if (Intrinsics.areEqual(resultType, Maybe.class)) {
            return (Return) new C23201q((RestfulCall) call).singleElement();
        }
        return Intrinsics.areEqual(resultType, InterfaceC23186b.class) ? call : (Return) call.execute();
    }
}
