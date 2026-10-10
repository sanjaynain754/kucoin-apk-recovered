package com.kubi.credential.jetpack;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.credential.jetpack.a */
/* JADX INFO: compiled from: JetpackContext.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/credential/jetpack/a;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "context", "", "assetLinks", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getApplicationContext", "()Landroid/content/Context;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Ljava/lang/String;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C12469a extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String assetLinks;

    /* JADX INFO: renamed from: com.kubi.credential.jetpack.a$a */
    /* JADX INFO: compiled from: JetpackContext.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/credential/jetpack/a$a", "Lcom/kubi/credential/jetpack/e;", "", "id", "", "getString", "(I)Ljava/lang/String;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a extends C12473e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Resources resources) {
            super(resources);
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
        }

        @Override // com.kubi.credential.jetpack.C12473e, android.content.res.Resources
        @NotNull
        public String getString(int id2) {
            return (C12469a.this.assetLinks == null || R$string.asset_statements != id2) ? super.getString(id2) : C12469a.this.assetLinks;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12469a(@NotNull Context context, @Nullable String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.assetLinks = str;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @NotNull
    public Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "super.getApplicationContext()");
        return new C12469a(applicationContext, this.assetLinks);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return new a(this.context.getResources());
    }
}
