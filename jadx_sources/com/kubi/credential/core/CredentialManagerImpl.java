package com.kubi.credential.core;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.model.CredentialType;
import com.kubi.credential.track.IFlowTrackKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200df.C36669a;
import p230ef.AbstractC37150a;
import p230ef.AbstractC37151b;
import p230ef.C37158i;
import p230ef.C37159j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialManagerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/credential/core/CredentialManagerImpl;", "Lcom/kubi/credential/core/a;", "Ldf/a;", "config", "<init>", "(Ldf/a;)V", "Landroid/content/Context;", "context", "Lef/a;", "request", "Lef/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lef/i;", "Lef/j;", "b", "(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kubi/credential/model/CredentialType;", "c", "()Ljava/util/List;", "Ldf/a;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CredentialManagerImpl implements InterfaceC12468a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C36669a config;

    public CredentialManagerImpl(@NotNull C36669a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo23421a(@NotNull Context context, @NotNull AbstractC37150a abstractC37150a, @NotNull Continuation<? super AbstractC37151b> continuation) {
        return IFlowTrackKt.m23447a(this.config.m82052a().create(), new CredentialManagerImpl$createCredential$2(this, context, abstractC37150a, null), continuation);
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo23422b(@NotNull Context context, @NotNull C37158i c37158i, @NotNull Continuation<? super C37159j> continuation) {
        return IFlowTrackKt.m23447a(this.config.m82054c().create(), new CredentialManagerImpl$getCredential$2(this, context, c37158i, null), continuation);
    }

    @Override // com.kubi.credential.core.InterfaceC12468a
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<CredentialType> mo23423c() {
        return this.config.getCredentialManager().mo23423c();
    }
}
