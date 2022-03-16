package com.bjy.idea.plugin.action;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;

/**
 * @author xupei
 * @version 1.0
 * @description
 * @date 2022/03/16
 */
public class MyNotifier {

    public static void notifyError(@Nullable Project project, String content) {
        NotificationGroupManager.getInstance().getNotificationGroup("com.bjy.idea.plugin.action")
                .createNotification(content, NotificationType.INFORMATION)
                .notify(project);
    }

}