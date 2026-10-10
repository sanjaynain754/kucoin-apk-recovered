package fr;

import com.kubi.network.api.model.NetworkResponse;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: fr.a */
/* JADX INFO: compiled from: ICall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lfr/a;", "Lfr/c;", "<init>", "()V", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37580a implements InterfaceC37582c {
    @Override // fr.InterfaceC37582c
    /* JADX INFO: renamed from: a */
    public void mo23836a(@NotNull NetworkResponse<?> networkResponse) {
        InterfaceC37582c.a.m84718b(this, networkResponse);
    }

    @Override // fr.InterfaceC37582c
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC37582c mo23837b(@NotNull Executor executor) {
        return InterfaceC37582c.a.m84719c(this, executor);
    }

    @Override // fr.InterfaceC37582c
    public void onFailure(@NotNull Throwable th2) {
        InterfaceC37582c.a.m84717a(this, th2);
    }
}
