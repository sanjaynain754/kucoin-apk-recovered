package com.kubi.httpdns.track;

import hk.C38225d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.httpdns.track.a */
/* JADX INFO: compiled from: IInterpretTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/httpdns/track/a;", "Lcom/kubi/httpdns/track/IInterpretTrack$a;", "<init>", "()V", "", "host", "Lhk/d;", "b", "(Ljava/lang/String;)Lhk/d;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15207a implements IInterpretTrack.InterfaceC15205a {
    @Override // com.kubi.httpdns.track.IInterpretTrack.InterfaceC15205a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C38225d mo31504a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new C38225d(host);
    }
}
