package com.bjy.idea.plugin.action;
import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.DateUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Date;


public class MyPlugin extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Project currentProject = event.getProject();
        String today= DateUtil.today();
        String endTime="18:30:00";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(today).append(" ").append(endTime);
        Date date = DateUtil.parse(stringBuilder);
        String formatBetween = DateUtil.formatBetween(date,new Date(), BetweenFormatter.Level.MINUTE);
        MyNotifier.notifyError(currentProject,formatBetween);
    }
}
