package com.jumio.commons.camera.renderer.opengl;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "Ljava/io/Serializable;", "createFragmentShader", "", "samplerVarName", "fragCoordsVarName", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ShaderProvider extends Serializable {
    @Nullable
    String createFragmentShader(@NotNull String samplerVarName, @NotNull String fragCoordsVarName);
}
