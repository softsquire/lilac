package com.snail.lilac.service.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snail.lilac.model.i18n.I18NMessage;
import com.snail.lilac.repository.i18n.I18NMessageRepository;
import com.snail.lilac.service.AbstractService;

/**
 * @author Andy
 * @since 2013-5-22
 */
@Service
public class I18NMessageService extends AbstractService<I18NMessageRepository, I18NMessage, String> {

    @Autowired
    private I18NMessageRepository i18nMessageRepository;

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.service.AbstractService#setRepository(com.snail.lilac.core.repository.BaseRepository)
     */
    @Override
    public void setRepository(I18NMessageRepository repository) {
        this.repository = repository;
    }

    /**
     * @param code
     * @param language
     * @return
     */
    public String findOne(String code, String language) {
        return null;
    }
}
