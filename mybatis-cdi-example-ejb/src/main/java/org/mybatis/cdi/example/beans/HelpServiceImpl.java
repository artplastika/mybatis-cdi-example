package org.mybatis.cdi.example.beans;

import org.mybatis.cdi.Mapper;
import org.mybatis.cdi.example.data.Help;

import javax.inject.Inject;

public class HelpServiceImpl implements HelpService {

    @Inject
    @Mapper
    private HelpRepository helpRepository;

    @Override
    public Help getHelp(Long id) {
        return helpRepository.getHelp(id);
    }
}
