package com.kubi.credential.core;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.exception.CreateCredentialException;
import com.kubi.credential.exception.GetCredentialException;
import com.kubi.credential.model.CredentialType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230ef.AbstractC37150a;
import p230ef.AbstractC37151b;
import p230ef.C37158i;
import p230ef.C37159j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.credential.core.a */
/* JADX INFO: compiled from: ICredentialManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/credential/core/a;", "", "Landroid/content/Context;", "context", "Lef/a;", "request", "Lef/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lef/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lef/i;", "Lef/j;", "b", "(Landroid/content/Context;Lef/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kubi/credential/model/CredentialType;", "c", "()Ljava/util/List;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC12468a {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo23421a(@NotNull Context context, @NotNull AbstractC37150a abstractC37150a, @NotNull Continuation<? super AbstractC37151b> continuation) throws CreateCredentialException;

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo23422b(@NotNull Context context, @NotNull C37158i c37158i, @NotNull Continuation<? super C37159j> continuation) throws GetCredentialException;

    @NotNull
    /* JADX INFO: renamed from: c */
    List<CredentialType> mo23423c();
}
