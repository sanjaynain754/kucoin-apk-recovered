package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.cfg.b */
/* JADX INFO: compiled from: ConfigOverride.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6344b {
    protected JsonFormat.Value _format;
    protected JsonIgnoreProperties.Value _ignorals;
    protected JsonInclude.Value _include;
    protected JsonInclude.Value _includeAsProperty;
    protected Boolean _isIgnoredType;
    protected Boolean _mergeable;
    protected JsonSetter.Value _setterInfo;
    protected JsonAutoDetect.Value _visibility;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.cfg.b$a */
    /* JADX INFO: compiled from: ConfigOverride.java */
    public static final class a extends AbstractC6344b {

        /* JADX INFO: renamed from: b */
        public static final a f10213b = new a();
    }

    public AbstractC6344b() {
    }

    public AbstractC6344b(AbstractC6344b abstractC6344b) {
        this._format = abstractC6344b._format;
        this._include = abstractC6344b._include;
        this._includeAsProperty = abstractC6344b._includeAsProperty;
        this._ignorals = abstractC6344b._ignorals;
        this._setterInfo = abstractC6344b._setterInfo;
        this._visibility = abstractC6344b._visibility;
        this._isIgnoredType = abstractC6344b._isIgnoredType;
        this._mergeable = abstractC6344b._mergeable;
    }

    public static AbstractC6344b empty() {
        return a.f10213b;
    }

    public JsonFormat.Value getFormat() {
        return this._format;
    }

    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    public JsonInclude.Value getInclude() {
        return this._include;
    }

    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }
}
