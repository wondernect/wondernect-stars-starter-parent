package com.wondernect.stars.starter.event;

import org.springframework.context.ApplicationEvent;

/**
 * Copyright (C), 2020, wondernect.com
 * FileName: RoleTypeEvent
 * Author: chenxun
 * Date: 2020-06-23 14:08
 * Description: 角色事件
 */
public class StarsEvent extends ApplicationEvent {

    private static final long serialVersionUID = -1917849828371385501L;

    private StarsEventType starsEventType;

    public StarsEvent(Object source, StarsEventType starsEventType) {
        super(source);
        this.starsEventType = starsEventType;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public StarsEventType getStarsEventType() {
        return starsEventType;
    }

    public void setStarsEventType(StarsEventType starsEventType) {
        this.starsEventType = starsEventType;
    }
}
