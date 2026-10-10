package com.sensorsdata.analytics.android.sdk.visual.model;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class VisualConfig {
    public String appId;
    public List<VisualPropertiesConfig> events;

    /* JADX INFO: renamed from: os */
    public String f56493os;
    public String project;
    public String version;

    public static class VisualEvent {
        public String elementContent;
        public String elementPath;
        public String elementPosition;
        public boolean limitElementContent;
        public boolean limitElementPosition;
        public String screenName;

        public String toString() {
            return "VisualEvent{elementPath='" + this.elementPath + "', elementPosition='" + this.elementPosition + "', elementContent='" + this.elementContent + "', screenName='" + this.screenName + "', limitElementPosition=" + this.limitElementPosition + ", limitElementContent=" + this.limitElementContent + '}';
        }
    }

    public static class VisualPropertiesConfig {
        public VisualEvent event;
        public String eventName;
        public String eventType;
        public List<VisualProperty> properties;

        public String toString() {
            return "VisualPropertiesConfig{eventName='" + this.eventName + "', eventType='" + this.eventType + "', event=" + this.event + ", properties=" + this.properties + '}';
        }
    }

    public static class VisualProperty {
        public String elementPath;
        public String elementPosition;
        public String name;
        public String regular;
        public String screenName;
        public String type;

        public String toString() {
            return "VisualProperty{elementPath='" + this.elementPath + "', elementPosition='" + this.elementPosition + "', screenName='" + this.screenName + "', name='" + this.name + "', regular='" + this.regular + "', type='" + this.type + "'}";
        }
    }

    public String toString() {
        return "VisualConfig{appId='" + this.appId + "', os='" + this.f56493os + "', project='" + this.project + "', version='" + this.version + "', events=" + this.events + '}';
    }
}
