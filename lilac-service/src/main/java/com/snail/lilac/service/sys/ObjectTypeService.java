package com.snail.lilac.service.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.model.sys.ObjectType;
import com.snail.lilac.repository.sys.ObjectTypeRepository;
import com.snail.lilac.service.AbstractService;

/**
 * @author Andy
 * @since 2013-5-16
 */
@Service
@Transactional
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {/*
                                                                                                   * public
                                                                                                   * Page<ObjectType>
                                                                                                   * findAll(Map<String,
                                                                                                   * Object>
                                                                                                   * searchParams,
                                                                                                   * Pageable pageable)
                                                                                                   * { final Map<String,
                                                                                                   * SearchFilter>
                                                                                                   * filters =
                                                                                                   * SearchFilter
                                                                                                   * .parse(searchParams
                                                                                                   * ); Specification<
                                                                                                   * ObjectType> spec =
                                                                                                   * new Specification<
                                                                                                   * ObjectType>() {
                                                                                                   * @Override public
                                                                                                   * Predicate
                                                                                                   * toPredicate
                                                                                                   * (Root<ObjectType>
                                                                                                   * root,
                                                                                                   * CriteriaQuery<?>
                                                                                                   * query,
                                                                                                   * CriteriaBuilder cb)
                                                                                                   * { List<Predicate>
                                                                                                   * predicates = new
                                                                                                   * ArrayList
                                                                                                   * <Predicate>(); for
                                                                                                   * (SearchFilter
                                                                                                   * searchFilter :
                                                                                                   * filters.values()) {
                                                                                                   * Expression<Object>
                                                                                                   * fieldExpression =
                                                                                                   * root
                                                                                                   * .get(searchFilter
                                                                                                   * .fieldName);
                                                                                                   * predicates
                                                                                                   * .add(cb.equal
                                                                                                   * (fieldExpression,
                                                                                                   * searchFilter
                                                                                                   * .value)); } if
                                                                                                   * (predicates
                                                                                                   * .isEmpty()) {
                                                                                                   * return
                                                                                                   * cb.and(predicates
                                                                                                   * .toArray(new
                                                                                                   * Predicate
                                                                                                   * [predicates
                                                                                                   * .size()])); }
                                                                                                   * return
                                                                                                   * cb.conjunction(); }
                                                                                                   * }; return null; }
                                                                                                   */

    /**
     * @param className
     * @return
     */
    /*
     * public ObjectType findByClassName(String className) { return repository.findByClassName(className); }
     */

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.service.AbstractService#setRepository(com.snail.lilac.core.repository.BaseRepository)
     */
    @Autowired
    @Override
    public void setRepository(ObjectTypeRepository repository) {
        this.repository = repository;
    }

}
