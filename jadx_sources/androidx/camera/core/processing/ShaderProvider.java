package androidx.camera.core.processing;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ShaderProvider {
    default String createFragmentShader(String str, String str2) {
        return null;
    }
}
