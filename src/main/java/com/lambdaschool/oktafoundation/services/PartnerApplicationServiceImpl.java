package com.lambdaschool.oktafoundation.services;


import com.lambdaschool.oktafoundation.models.PartnerApplication;
import com.lambdaschool.oktafoundation.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "partnerApplicationService")
public class PartnerApplicationServiceImpl implements PartnerApplicationService
{
    @Override
    public void deleteAll()
    {

    }

    @Override
    public PartnerApplication save(PartnerApplication partnerApplication)
    {
        return null;
    }

    @Override
    public PartnerApplication update(
        User user,
        PartnerApplication partnerApplication,
        long id)
    {
        return null;
    }

    @Override
    public PartnerApplication updatePartAppStatus(
        PartnerApplication partnerApplication,
        long id)
    {
        return null;
    }

    @Override
    public List<PartnerApplication> findAll()
    {
        return null;
    }

    @Override
    public PartnerApplication findPartAppById(long id)
    {
        return null;
    }

    @Override
    public PartnerApplication saveByAuth(
        User user,
        PartnerApplication app,
        long id)
    {
        return null;
    }
}