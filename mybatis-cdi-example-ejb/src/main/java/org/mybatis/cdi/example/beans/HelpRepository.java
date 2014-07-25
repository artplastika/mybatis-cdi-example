package org.mybatis.cdi.example.beans;

import org.mybatis.cdi.example.data.Help;

public interface HelpRepository {

    Help getHelp(Long id);
}
