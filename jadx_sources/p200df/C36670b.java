package p200df;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.core.CredentialManagerImpl;
import com.kubi.credential.core.InterfaceC12468a;
import com.kubi.credential.model.CredentialType;
import com.kubi.credential.utils.C12482a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230ef.AbstractC37150a;
import p230ef.AbstractC37151b;
import p230ef.C37158i;
import p230ef.C37159j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: compiled from: KCredentialManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Ldf/b;", "Lcom/kubi/credential/core/a;", "<init>", "()V", "Ldf/a;", "config", "", "d", "(Ldf/a;)V", "Landroid/content/Context;", "context", "Lef/a;", "request", "Lef/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lef/i;", "Lef/j;", "b", "(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kubi/credential/model/CredentialType;", "c", "()Ljava/util/List;", "Lcom/kubi/credential/core/a;", "proxy", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C36670b implements InterfaceC12468a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36670b f79491a = new C36670b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC12468a proxy;

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m82055d(@NotNull C36669a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        proxy = new CredentialManagerImpl(config);
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo23421a(@NotNull Context context, @NotNull AbstractC37150a abstractC37150a, @NotNull Continuation<? super AbstractC37151b> continuation) {
        return ((InterfaceC12468a) C12482a.f21334a.m23470a(proxy)).mo23421a(context, abstractC37150a, continuation);
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo23422b(@NotNull Context context, @NotNull C37158i c37158i, @NotNull Continuation<? super C37159j> continuation) {
        return ((InterfaceC12468a) C12482a.f21334a.m23470a(proxy)).mo23422b(context, c37158i, continuation);
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<CredentialType> mo23423c() {
        return ((InterfaceC12468a) C12482a.f21334a.m23470a(proxy)).mo23423c();
    }
}
